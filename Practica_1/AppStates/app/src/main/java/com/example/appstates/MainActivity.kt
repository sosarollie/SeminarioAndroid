package com.example.appstates

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
        Log.d("onCreate","Se ejecutó onCreate()");
    }
    override fun onPause() {
        super.onPause();
        Log.d("onPause","Se ejecutó onPause()");
    }

    override fun onStop() {
        super.onStop();
        Log.d("onStop","Se ejecutó onStop()");
    }

    override fun onResume() {
        super.onResume();
        Log.d("onResume","Se ejecutó onResume()");
    }

    override fun onDestroy() {
        super.onDestroy();
        Log.d("onDestroy","Se ejecutó onDestroy()");
    }
}