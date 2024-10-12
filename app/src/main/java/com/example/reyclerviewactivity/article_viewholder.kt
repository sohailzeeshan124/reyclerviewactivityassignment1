package com.example.reyclerviewactivity

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView

class article_viewholder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val itemimage: ImageView= itemView.findViewById(R.id.book_image)
    val titletext: TextView= itemView.findViewById(R.id.booktitle)
  //  val descriptiontext: TextView= itemView.findViewById(R.id.book_details)
    val pricetext: TextView= itemView.findViewById(R.id.bookprice)
    val star: TextView=itemView.findViewById(R.id.star)
    val soldunits:TextView=itemView.findViewById(R.id.soldunits)



}