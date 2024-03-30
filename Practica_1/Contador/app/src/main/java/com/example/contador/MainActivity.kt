package com.example.contador

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private var contador = findViewById<TextView>(R.id.txtContador);

    fun mostrarInfo(v: View) {
        val i = Intent(this, Activity2::class.java)
        getCont.launch(i);
    }
    private var getCont = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) {
            result ->
        var num = Integer.parseInt(contador.text.toString());
        if (result.resultCode == RESULT_OK) {
            num++;
            contador.text = num.toString();
        } else if (result.resultCode == RESULT_CANCELED){
            num--;
            contador.text = num.toString();
        }
    }
}