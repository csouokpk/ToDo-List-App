package com.example.kotlin_todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin_todo.databinding.ActivityAddCommentsBinding
import com.example.kotlin_todo.databinding.ActivitySearchBinding

class SearchActivity : AppCompatActivity() {

    private lateinit var binding: ActivitySearchBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout using ViewBinding
        binding = ActivitySearchBinding.inflate(layoutInflater)
        setContentView(R.layout.activity_search)
        setContentView(binding.root)

        // Set up click listener for the done button
        binding.doneButton.setOnClickListener{

            // Finish the current activity
            finish()

            // Create an intent to navigate back to the main activity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        // Set up click listener for the done button
        binding.image1View.setOnClickListener {

            // Create an intent to navigate back to the main activity
            val intent = Intent(this, AddCommentsActivity::class.java)
            startActivity(intent)
        }
    }
}