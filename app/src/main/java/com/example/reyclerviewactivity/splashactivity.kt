package com.example.reyclerviewactivity

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class splashactivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splashactivity)


       Handler(mainLooper).postDelayed({
        startActivity(Intent(this, MainActivity::class.java) )
           finish()
       },3000)
    }


}