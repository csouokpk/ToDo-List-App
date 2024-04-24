package com.example.kotlin_todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.kotlin_todo.databinding.ActivityAddCommentsBinding

class AddCommentsActivity : AppCompatActivity() {

    private lateinit var binding: ActivityAddCommentsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Inflate layout using ViewBinding
        binding = ActivityAddCommentsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up click listener for the add button
        binding.addButton.setOnClickListener{

            // Finish the current activity
            finish()

            // Create an intent to start the MainActivity
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)

            // Display a toast message indicating that the comment is saved
            Toast.makeText(this, "Comment Saved", Toast.LENGTH_LONG).show()
        }

    }
}