package com.okuhle.st10317674exam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView

class MainActivity : AppCompatActivity() {

    private lateinit var etApp:EditText
    private lateinit var etName:EditText
    private lateinit var etSTnumber:EditText
    private lateinit var imageView2: ImageView
    private lateinit var buttonStart: Button
    private lateinit var buttonExit: Button

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etApp = findViewById(R.id.etApp)
        etName= findViewById(R.id.etName)
        etSTnumber =  findViewById(R.id.etSTnumber)
        imageView2 = findViewById(R.id.imageView2)
        buttonStart = findViewById(R.id.buttonStart)
        buttonExit = findViewById(R.id.buttonExit)

        buttonStart.setOnClickListener {
            val intent = Intent(this, MainScreen::class.java)
            startActivity(intent)

        }
    }
}