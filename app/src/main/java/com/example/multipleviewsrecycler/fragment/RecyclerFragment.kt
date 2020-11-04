package com.example.multipleviewsrecycler.fragment

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.multipleviewsrecycler.R
import com.example.multipleviewsrecycler.adapters.MainAdapter
import com.example.multipleviewsrecycler.databinding.RecyclerFragmentBinding

class RecyclerFragment : Fragment() {

    companion object {
        fun newInstance() = RecyclerFragment()
    }

    private lateinit var viewModel: RecyclerViewModel
    lateinit var binding : RecyclerFragmentBinding
    lateinit var data : ArrayList<Any>

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, R.layout.recycler_fragment, container,false)
        return binding.root
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        viewModel = ViewModelProviders.of(this).get(RecyclerViewModel::class.java)
        data = viewModel.getAllData() as ArrayList<Any>
        binding.recyclerViewFragment.layoutManager = LinearLayoutManager(context)
        binding.recyclerViewFragment.adapter = MainAdapter(data)
    }

}