package com.example.multipleviewsrecycler.utils

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewsrecycler.ViewHolders.MovieViewHolder
import com.example.multipleviewsrecycler.adapters.EmployeeAdapter
import com.example.multipleviewsrecycler.adapters.MoviesAdapter
import com.example.multipleviewsrecycler.adapters.MoviesAdapter2
import com.example.multipleviewsrecycler.dao.Employee
import com.example.multipleviewsrecycler.dao.Movie
import com.example.multipleviewsrecycler.dao.TwoImageModel

fun Context.showToast(message : String ) {
    Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
}

fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
    return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
}

fun AdapterImplementation(
    viewHolder: MovieViewHolder,
    parentIem: List<Any>,
    viewPool: RecyclerView.RecycledViewPool, dataType: String
) {
    val layoutManager = LinearLayoutManager(
        viewHolder.recyclerView.context,
        LinearLayoutManager.HORIZONTAL,
        false
    )
    layoutManager.initialPrefetchItemCount = parentIem.size
    viewHolder.recyclerView.layoutManager = layoutManager

    when(dataType) {
        "Employee" ->
            viewHolder.recyclerView.adapter = EmployeeAdapter(parentIem as List<Employee>)
        "MoviesOne" ->
            viewHolder.recyclerView.adapter = MoviesAdapter(parentIem as List<Movie>)
        "MovieTwo" ->
            viewHolder.recyclerView.adapter = MoviesAdapter2(parentIem as List<TwoImageModel>)
    }
    viewHolder.recyclerView.setRecycledViewPool(viewPool)
}