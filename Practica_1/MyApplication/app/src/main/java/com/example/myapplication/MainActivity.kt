package com.example.myapplication

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.view.View
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
    }
    fun onBtnClick(view: View?) {
        val i = Intent(this, NuevaActivity2::class.java)
        i.putExtra("msg","Este String me lo pasó la actividad main");
        startActivity(i)
    }
}