package com.example.myapplication

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class NuevaActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        enableEdgeToEdge();
        setContentView(R.layout.activity_nueva2);
        Log.d("APP_DE_PRUEBA", "Este es mi mensaje de debug");
        val extras = intent.extras;
        val msg = extras?.getString("msg");
        if (msg != null) Log.d("ACTIVITY 2", msg);
    }
    fun onBtnClick(view: View?) {
        val i2 = Intent();
        i2.action = Intent.ACTION_VIEW;
        i2.data = Uri.parse("https://info.unlp.edu.ar");
        startActivity(i2);
    }
}