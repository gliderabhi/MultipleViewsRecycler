package com.example.multipleviewsrecycler

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.example.multipleviewsrecycler.fragment.DemoFragment
import com.example.multipleviewsrecycler.fragment.RecyclerFragment


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if(savedInstanceState == null) { // initial transaction should be wrapped like this
            supportFragmentManager.beginTransaction()
                .add(R.id.recyclerViewContainer, RecyclerFragment())
                .commit()
        }

       /* val button = findViewById<Button>(R.id.buttonChanger)
        button.setOnClickListener{
            supportFragmentManager.beginTransaction()
                .replace(R.id.recyclerViewContainer, DemoFragment())
                .commit()

            supportFragmentManager.beginTransaction()
        }*/
    }

    override fun onBackPressed() {
        supportFragmentManager.beginTransaction().remove(RecyclerFragment()).commit()
    }

}