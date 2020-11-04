package com.example.multipleviewsrecycler.ViewHolders

import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewsrecycler.dao.Employee
import com.example.multipleviewsrecycler.databinding.Layout2Binding

class EmailViewHolder(itemView: Layout2Binding) : RecyclerView.ViewHolder(itemView.root) {
    val layout2Binding : Layout2Binding = itemView
    fun setEmailDetails(get: Employee) {
        layout2Binding.employee = get
    }

}