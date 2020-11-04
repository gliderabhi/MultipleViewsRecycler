package com.example.multipleviewsrecycler.ViewHolders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewsrecycler.R

class MovieViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
    var recyclerView: RecyclerView = itemView.findViewById(R.id.recyclerView2) as RecyclerView
}