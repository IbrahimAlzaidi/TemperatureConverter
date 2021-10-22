package com.example.temperatureconverter.util


import android.view.View
import androidx.databinding.BindingAdapter
import com.example.temperatureconverter.R

@BindingAdapter(value = ["myColors"])
fun setViewColors(view: View, temperatureCelsius: String?) {
    temperatureCelsius?.toDouble()?.let { value ->
        val color = when {
            value < 0 -> view.context.getColor(R.color.blue)
            value in 0.0..20.0 -> view.context.getColor(R.color.green)
            value in 21.0..30.0 -> view.context.getColor(R.color.yellow)
            value in 31.0..40.0 -> view.context.getColor(R.color.orange)
            else -> view.context.getColor(R.color.red)
        }
        view.setBackgroundColor(color)
    }
}
