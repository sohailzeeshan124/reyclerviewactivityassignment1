package com.example.reyclerviewactivity

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class secondarticle_activity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_secondarticle)

        val bookimage:ImageView= findViewById(R.id.imageView2)
        val bookname:TextView= findViewById(R.id.bookname)
        val price:TextView= findViewById(R.id.price)
        val desc:TextView= findViewById(R.id.description)
        val authorname:TextView= findViewById(R.id.author)


        bookimage.setImageResource(intent.getIntExtra("bookimage",R.drawable.donquixote))
        bookname.text= intent.getStringExtra("title")
        price.text= intent.getStringExtra("price")
        desc.text= intent.getStringExtra("description")
        authorname.text= intent.getStringExtra("publisher")
    }
}