package com.example.multipleviewsrecycler.ViewHolders

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.multipleviewsrecycler.R
import com.example.multipleviewsrecycler.dao.TwoImageModel
import com.example.multipleviewsrecycler.databinding.TwoMovieItemBinding

class ChildViewHolder2(itemView: TwoMovieItemBinding) : RecyclerView.ViewHolder(itemView.root) {
    val bind = itemView
    fun bindChild(movie: TwoImageModel) {
        bind.twoImage = movie
        /*val image1 = itemView.findViewById(R.id.imageView) as ImageView
        val image2 = itemView.findViewById(R.id.imageView2) as ImageView
        Glide.with(itemView.context).load(movie.image1Url).into(image1)
        Glide.with(itemView.context).load(movie.image2Url).into(image2)*/
    }
}