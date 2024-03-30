package com.example.lifecycle

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LifeCycleActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_life_cycle)
    }
    override fun onDestroy() {
        super.onDestroy()
        (findViewById<View>(R.id.texto) as TextView).text = "HOLA MUNDO!"
        val i = Intent(this, LifeCycleActivity::class.java)
        this.startActivity(i)
    }
}