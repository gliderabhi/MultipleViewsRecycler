package com.example.multipleviewsrecycler.repositories

import android.app.Application
import com.example.multipleviewsrecycler.R
import com.example.multipleviewsrecycler.dao.Employee
import com.example.multipleviewsrecycler.dao.Movie
import com.example.multipleviewsrecycler.dao.TwoImageModel

class MoviesImagesRepo (application: Application) {
    private val application = application

    //TODO() add functionality to add data dynamically

    private fun getMoviesList(): List<Any> {
        val moviesList: ArrayList<Any> = ArrayList()
        moviesList.add(Movie("Avengers",application.resources.getString(R.string.avengers) ))
        moviesList.add(Movie("Thor", application.resources.getString(R.string.thor)) )
        moviesList.add(Movie("Avengers", application.resources.getString(R.string.avengers)))

        return moviesList
    }
    private fun getTwoMovies(): List<Any> {
        val moviesList: ArrayList<Any> = ArrayList()
        moviesList.add(TwoImageModel(application.resources.getString(R.string.avengers),application.resources.getString(R.string.thor) ))
        moviesList.add(TwoImageModel(application.resources.getString(R.string.thor), application.resources.getString(R.string.avengers)) )
        moviesList.add(TwoImageModel(application.resources.getString(R.string.avengers), application.resources.getString(R.string.thor)))

        return moviesList
    }

    public fun getData() : ArrayList<Any> {
        val data : ArrayList<Any> = ArrayList()
        data.add(addEmployees())
        data.add(getMoviesList())
        data.add(getTwoMovies())

        return data
    }
    public fun addEmployees() : ArrayList<Any> {
        val employees : ArrayList<Any>  = ArrayList()

        var employee = Employee()
        employee.name = "Robert"
        employee.address = "New York"
        employee.phone = "+61234456"
        employees.add(employee)
        //added once
        employee = Employee()
        employee.name = "Tom"
        employee.address = "California"
        employee.email = "tom_frank@gmail.com"
        employees.add(employee)
//added 2
        employee = Employee()
        employee.name = "Smith"
        employee.address = "Philadelphia"
        employee.email = "smith_carrol@gmail.com"
        employees.add(employee)
//added 3
        employee = Employee()
        employee.name = "Ryan"
        employee.address = "Canada"
        employee.phone = "+612001456"
        employees.add(employee)
//added 4
        employee = Employee()
        employee.name = "Mark"
        employee.address = "Boston"
        employee.email = "mark_walmerd@gmail.com"
        employees.add(employee)
//added 5
        employee = Employee()
        employee.name = "Adam"
        employee.address = "Brooklyn"
        employee.phone = "+61211780"
        employees.add(employee)
//added 6
        employee = Employee()
        employee.name = "Kevin"
        employee.address = "New Jersey"
        employee.phone = "+94221035"
        employees.add(employee)
//added 7

   /*     employees.add(getMoviesList())
        employees.add(getTwoMovies())*/
        return employees
    }

}