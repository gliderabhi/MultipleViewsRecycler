package com.example.multipleviewsrecycler.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewsrecycler.R
import com.example.multipleviewsrecycler.ViewHolders.MovieViewHolder
import com.example.multipleviewsrecycler.dao.Employee
import com.example.multipleviewsrecycler.dao.Movie
import com.example.multipleviewsrecycler.dao.TwoImageModel
import com.example.multipleviewsrecycler.databinding.Layout3Binding
import com.example.multipleviewsrecycler.utils.AdapterImplementation

class MainAdapter(var data: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>(){
    private val TYPE_EMP = 1
    private val TYPE_MOVIE = 2
    private val TYPE_TWO_MOVIE = 3
    val viewPool : RecyclerView.RecycledViewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var view: View
        val binding : Layout3Binding = DataBindingUtil.inflate(
            LayoutInflater.from(viewGroup.context), R.layout.layout3, viewGroup, false)
        return MovieViewHolder(binding.root)

    }

    override fun onBindViewHolder(viewHolder: RecyclerView.ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            TYPE_EMP -> {
                (viewHolder as MovieViewHolder)
                val parentItem = data[position] as List<Employee>
                AdapterImplementation(viewHolder,parentItem,viewPool, "Employee")
            }
            TYPE_MOVIE -> {
                (viewHolder as MovieViewHolder)
                val parentItem = data[position] as List<Movie>
                Log.e("tag",position.toString() + "\n" + parentItem )
                AdapterImplementation(viewHolder,parentItem, viewPool, "MoviesOne")

            }
            TYPE_TWO_MOVIE -> {
                viewHolder as MovieViewHolder
                val parentIem = data[position] as List<TwoImageModel>
                AdapterImplementation(viewHolder, parentIem,viewPool,"MovieTwo")
            }
        }
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun getItemViewType(position: Int): Int {
        when(position) {
            0 -> return TYPE_EMP
            1 -> return TYPE_MOVIE
            2 -> return TYPE_TWO_MOVIE
        }
        return TYPE_MOVIE
    }

}