package com.example.multipleviewsrecycler.adapters


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewsrecycler.R
import com.example.multipleviewsrecycler.dao.TwoImageModel
import com.example.multipleviewsrecycler.ViewHolders.ChildViewHolder2
import com.example.multipleviewsrecycler.databinding.TwoMovieItemBinding

class MoviesAdapter2 (private var childItemList : List<TwoImageModel> )  :
    RecyclerView.Adapter<ChildViewHolder2>() {

    override fun onCreateViewHolder(
        parent: ViewGroup,
        viewType: Int
    ): ChildViewHolder2 {
        val binding : TwoMovieItemBinding = DataBindingUtil.inflate(
            LayoutInflater.from(parent.context), R.layout.two_movie_item, parent, false
        )
        return ChildViewHolder2(binding)
    }

    override fun onBindViewHolder(holder: ChildViewHolder2, position: Int) {
        holder.bindChild(childItemList[position])

    }

    override fun getItemCount(): Int {
        return childItemList.size
    }



}