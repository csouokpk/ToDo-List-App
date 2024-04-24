package com.example.kotlin_todo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.kotlin_todo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Pause execution for a short duration to simulate splash screen
        Thread.sleep(700)

        // Install splash screen
        installSplashScreen()

        // Inflate layout using ViewBinding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set up click listener for the add button
        binding.addButton.setOnClickListener {

            // Create an intent to start the AddCommentsActivity
            val intent = Intent(this, AddCommentsActivity::class.java)
            startActivity(intent)
        }
        // Set up click listener for the search button
        binding.searchButton.setOnClickListener {

            // Create an intent to start the SearchActivity
            val intent = Intent(this, SearchActivity::class.java)
            startActivity(intent)
        }

        binding.imgeditView.setOnClickListener {

            // Create an intent to start the SearchActivity
            val intent = Intent(this, AddCommentsActivity::class.java)
            startActivity(intent)
        }
    }
}