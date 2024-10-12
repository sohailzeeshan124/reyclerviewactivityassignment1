package com.example.reyclerviewactivity

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class articleadapter(val articles:List<article>):RecyclerView.Adapter<article_viewholder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): article_viewholder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_article,parent,false)
        return article_viewholder(view)
    }



    override fun getItemCount(): Int {
        return articles.size
    }

    override fun onBindViewHolder(holder: article_viewholder, position: Int) {

        val article=articles.get(position)

        holder.titletext.text=article.title
     //   holder.descriptiontext.text=article.description
        holder.pricetext.text=article.price
        holder.itemimage.setImageResource(article.bookimage)
        holder.star.text=article.star
        holder.soldunits.text=article.soldunits


        holder.itemView.setOnClickListener {
            val intent = Intent(holder.itemView.context, secondarticle_activity::class.java)
            intent.putExtra("title", article.title)
            intent.putExtra("bookimage", article.bookimage)
            intent.putExtra("date", article.date)
            intent.putExtra("description", article.description)
            intent.putExtra("price", article.price)
            intent.putExtra("pages", article.pages)
            intent.putExtra("publisher", article.publisher)
            intent.putExtra("dimension", article.dimension)
            intent.putExtra("authorimg", article.authorimg)

            holder.itemView.context.startActivity(intent)
        }
    }

}