package com.example.multipleviewsrecycler.dao

import android.view.View
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

class TwoImageModel (val image1Url : String , val image2Url : String)

   @BindingAdapter("android:image1")
   public fun imageLoaderForImageOne (view : View, url : String) {
       Glide.with(view).load(url).into(view as ImageView)
   }

   @BindingAdapter("android:imag2")
   public fun imageLoaderForImageTwo (view : View, url : String) {
    Glide.with(view).load(url).into(view as ImageView)
   }