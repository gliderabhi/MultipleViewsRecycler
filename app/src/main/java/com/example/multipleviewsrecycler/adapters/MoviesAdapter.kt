package com.example.multipleviewsrecycler.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewsrecycler.dao.Movie
import com.example.multipleviewsrecycler.R
import com.example.multipleviewsrecycler.ViewHolders.ChildViewHolder
import com.example.multipleviewsrecycler.databinding.MovieItemBinding
import com.example.multipleviewsrecycler.utils.inflate

class MoviesAdapter (private var childItemList : List<Movie> )  :
    RecyclerView.Adapter<ChildViewHolder>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChildViewHolder {
        val bindig : MovieItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.movie_item, parent, false
        )

        return ChildViewHolder(bindig)
    }

    override fun onBindViewHolder(holder: ChildViewHolder, position: Int) {
        holder.bindChild(childItemList[position])

    }

    override fun getItemCount(): Int {
        return childItemList.size
    }



}