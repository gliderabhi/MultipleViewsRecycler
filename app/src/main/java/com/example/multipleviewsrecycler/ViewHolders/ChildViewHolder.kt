package com.example.multipleviewsrecycler.ViewHolders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.multipleviewsrecycler.dao.Movie
import com.example.multipleviewsrecycler.R
import com.example.multipleviewsrecycler.databinding.MovieItemBinding

class ChildViewHolder(itemView: MovieItemBinding) : RecyclerView.ViewHolder(itemView.root) {
    val binding = itemView
    fun bindChild(movie: Movie) {
        binding.movie1 = movie
        /*
        val image = itemView.findViewById(R.id.image) as ImageView
        val tet = itemView.findViewById(R.id.title) as TextView
        tet.text = movie.title
        Glide.with(itemView.context).load(movie.url).into(image)*/
    }
}