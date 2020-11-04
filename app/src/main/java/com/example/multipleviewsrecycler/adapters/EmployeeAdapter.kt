package com.example.multipleviewsrecycler.adapters

import android.text.TextUtils
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.multipleviewsrecycler.dao.Employee
import com.example.multipleviewsrecycler.R
import com.example.multipleviewsrecycler.ViewHolders.CallViewHolder
import com.example.multipleviewsrecycler.ViewHolders.EmailViewHolder
import com.example.multipleviewsrecycler.databinding.CallItemBinding
import com.example.multipleviewsrecycler.databinding.Layout2Binding


class EmployeeAdapter(var employees: List<Any>) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    private val TYPE_CALL = 1
    private val TYPE_EMAIL = 2
    private val TYPE_MOVIE = 3
    private val TYPW_TWO_MOVIE =4
    val viewPool : RecyclerView.RecycledViewPool = RecyclerView.RecycledViewPool()

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        var view: View
        val layoutBinding2 : Layout2Binding =DataBindingUtil.inflate(
            LayoutInflater.from(viewGroup.context),R.layout.layout2, viewGroup, false
        )
        when (viewType) {
            TYPE_CALL -> {
                 val layoutBinding : CallItemBinding = DataBindingUtil.inflate(
                    LayoutInflater.from(viewGroup.context),R.layout.call_item, viewGroup, false
                )
                return CallViewHolder(layoutBinding)
            }
            TYPE_EMAIL -> {
                val layoutBinding : Layout2Binding =DataBindingUtil.inflate(
                    LayoutInflater.from(viewGroup.context),R.layout.layout2, viewGroup, false
                )
                return EmailViewHolder(layoutBinding)
            }

        }
        return EmailViewHolder(layoutBinding2)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        when (getItemViewType(position)) {
            TYPE_CALL -> {
                val employee = employees[position] as Employee
                (viewHolder as CallViewHolder).setCallDetails(employee)
            }
            TYPE_EMAIL -> {
                val employee = employees[position] as Employee
                (viewHolder as EmailViewHolder).setEmailDetails(employee)
            }

        }

    }

    override fun getItemViewType(position: Int): Int {
        val emp = employees[position] as Employee
        return if (TextUtils.isEmpty(emp.email)) {
            Log.e("call", position.toString())
            TYPE_CALL
        } else {
            Log.e("mail", position.toString())
            TYPE_EMAIL
        }
    }

    override fun getItemCount(): Int {
        return employees.size
    }
}

