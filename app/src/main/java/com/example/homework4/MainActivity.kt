package com.example.homework4

import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import android.view.Menu
import android.view.MenuItem
import com.example.homework4.databinding.ActivityMainBinding
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val nameInput = findViewById<EditText>(R.id.nameInput)
        val sayHelloButton = findViewById<Button>(R.id.sayHelloButton)
        val helloMessage = findViewById<TextView>(R.id.helloMessage)

        sayHelloButton.setOnClickListener {
            val name = nameInput.text.toString()
            val message = "Hello Android $name"
            helloMessage.text = message
            helloMessage.textSize = 24F // Change text size
            helloMessage.setTextColor(resources.getColor(android.R.color.holo_blue_dark)) // Change text color
        }
    }
}