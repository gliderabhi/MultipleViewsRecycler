package com.example.multipleviewsrecycler.ViewHolders

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.multipleviewsrecycler.R
import com.example.multipleviewsrecycler.dao.Employee
import com.example.multipleviewsrecycler.databinding.CallItemBinding

class CallViewHolder(itemView: CallItemBinding) : RecyclerView.ViewHolder(itemView.root) {

    val itemBinding : CallItemBinding = itemView

    fun setCallDetails(employee: Employee) {
        itemBinding.employee = employee
    }

}