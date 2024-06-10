package com.okuhle.st10317674exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

private fun append() {
    TODO("Not yet implemented")
}

class DetailedView : AppCompatActivity() {

    private lateinit var tvDay: TextView
    private lateinit var tvMin: TextView
    private lateinit var tvMax: TextView
    private lateinit var tvWeather: TextView
    private lateinit var tvMessage: TextView
    private lateinit var buttonBack: Button

    private val dayArray = mutableListOf<Float>()
    private val maxArray = mutableListOf<Float>()
    private val minArray = mutableListOf<Float>()
    private val weatherArray = mutableListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detailed_view)

        tvDay = findViewById(R.id.tvDay)
        tvMin = findViewById(R.id.tvMin)
        tvMax = findViewById(R.id.tvMax)
        tvWeather = findViewById(R.id.tvWeather)
        tvMessage = findViewById(R.id.tvMessage)
        buttonBack = findViewById(R.id.buttonBack)

        val dayArray = intent.getFloatArrayExtra("dateArray")?.toList() ?: emptyList()
        val maxArray = intent.getFloatArrayExtra("maxArray")?.toList() ?: emptyList()
        val minArray = intent.getFloatArrayExtra("minArray")?.toList() ?: emptyList()
        val weatherArray = intent.getStringArrayExtra("weatherArray")?.toList() ?: emptyList()

        val day = StringBuilder()
        for (day in dayArray) {
            val index = null
            append()
        }
        val max = StringBuilder()
        for (max in maxArray) {
            val index = null
            append()
        }
        val min = StringBuilder()
        for (min in minArray) {
            val index = null
            append()
        }
        val weather = StringBuilder()
        for (weather in weatherArray) {
            val index = null
            append()

        }
        tvDay.text = day.toString()
        tvMax.text = max.toString()
        tvMin.text = min.toString()
        tvWeather = weather.toString()

        buttonBack.setOnClickListener {
            finish()
        }
        }
    }



