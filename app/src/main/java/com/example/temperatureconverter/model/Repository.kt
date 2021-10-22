package com.example.temperatureconverter.model

object Repository {
    fun temperatureConvert(tempVal: String): Double {
        return if (tempVal.isEmpty()) 0.0 else tempVal.toDouble().minus(32).div(1.8)
    }
}