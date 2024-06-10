package com.okuhle.st10317674exam

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.NumberFormatException

class MainScreen : AppCompatActivity() {

    private lateinit var etDay: EditText
    private lateinit var etMax: EditText
    private lateinit var etMin: EditText
    private lateinit var et_Weather: EditText
    private lateinit var buttonNext: Button
    private lateinit var buttonExit: Button
    private lateinit var buttonCalculate: Button
    private lateinit var buttonClear: Button

    private val dayArray = mutableListOf<Float>()
    private val maxArray = mutableListOf<Float>()
    private val minArray = mutableListOf<Float>()
    private val weatherArray = mutableListOf<String>()

    @SuppressLint("MissingInflatedId", "SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        etDay = findViewById(R.id.etDay)
        etMax = findViewById(R.id.etMax)
        etMin = findViewById(R.id.etMin)
        et_Weather = findViewById(R.id.et_Weather)

        buttonNext = findViewById(R.id.buttonNext)
        buttonExit = findViewById(R.id.buttonExit)
        buttonCalculate = findViewById(R.id.buttonCalculate)
        buttonClear = findViewById(R.id.buttonClear)

        buttonClear.setOnClickListener {
            etDay.setText("")
            etMax.setText("")
            etMin.setText("")
            et_Weather.setText("")
        }

        buttonCalculate.setOnClickListener {
            val screenTimeDay = etDay.text.toString()
            val screenTimeMax = etMax.text.toString()
            val screenTimeMin = etMin.text.toString()
            val screenTimeWeather = et_Weather.text.toString()

            if (screenTimeDay.isNotEmpty() && screenTimeMax.isNotEmpty() && screenTimeMin.isNotEmpty()) {
                try {
                    dayArray.add(screenTimeDay.toFloat())
                    maxArray.add(screenTimeMax.toFloat())
                    minArray.add(screenTimeMin.toFloat())
                    weatherArray.add((screenTimeWeather))
                    etDay.text.clear()
                    etMax.text.clear()
                    etMin.text.clear()
                    et_Weather.text.clear()
                } catch (e: NumberFormatException) {
                    "Please Calculate For the Weather today".also { et_Weather.text }
                }
            } else {
                "Input cannot be empty".also { et_Weather.text }
            }
            buttonNext.setOnClickListener {
                val intent = Intent(this, DetailedView::class.java)
                intent.putExtra("dayArray", dayArray.toFloatArray())
                intent.putExtra("maxArray", maxArray.toFloatArray())
                intent.putExtra("minArray", minArray.toFloatArray())
                intent.putExtra("weatherArray", weatherArray.toTypedArray())
            }
        }
    }
}