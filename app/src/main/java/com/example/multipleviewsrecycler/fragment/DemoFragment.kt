package com.example.multipleviewsrecycler.fragment

import android.app.Activity
import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.multipleviewsrecycler.R
import com.example.multipleviewsrecycler.databinding.DemoFragmentLayoutBinding
import com.example.multipleviewsrecycler.utils.showToast

class DemoFragment : Fragment() {
    companion object {
        fun newInstance() = RecyclerFragment()
    }


    override fun onAttach(context: Context) {
        super.onAttach(context)
        context.showToast("Fragment OnAttach")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        context?.showToast("Fragment onCreated")

        val binding : DemoFragmentLayoutBinding = DataBindingUtil.inflate(inflater, R.layout.demo_fragment_layout, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        context?.showToast("Fragment onViewCreated")
        super.onViewCreated(view, savedInstanceState)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        context?.showToast("Fragment onActivityCreated")
        super.onActivityCreated(savedInstanceState)
    }

    override fun onStart() {
        context?.showToast("Fragment onStart")
        super.onStart()
    }

    override fun onResume() {
        context?.showToast("Fragment onResume")
        super.onResume()
    }


    override fun onPause() {
        context?.showToast("Fragment onPause")
        super.onPause()
    }

    override fun onStop() {
        context?.showToast("Fragment onStop")
        super.onStop()
    }

    override fun onDestroyView() {
        context?.showToast("Fragment onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        context?.showToast("Fragment onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        context?.showToast("Fragment onDetach")
        super.onDetach()
    }
}