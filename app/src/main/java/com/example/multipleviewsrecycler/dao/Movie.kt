package com.example.multipleviewsrecycler.dao

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class Movie (val title: String, val url : String)

@BindingAdapter("android:image")
public fun loadImage (view : View, url: String) {
   Glide.with(view).load(url).into(view as ImageView)
}
