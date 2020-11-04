package com.example.multipleviewsrecycler.fragment

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import com.example.multipleviewsrecycler.repositories.MoviesImagesRepo

class RecyclerViewModel(application: Application) : AndroidViewModel(application) {
    lateinit var moviesImagesRepo : MoviesImagesRepo

    fun getAllData() : List<Any> {
        val application = getApplication() as Application
        moviesImagesRepo = MoviesImagesRepo(application)
        val listAllData : List<Any> = moviesImagesRepo.getData()
        return listAllData
    }

}