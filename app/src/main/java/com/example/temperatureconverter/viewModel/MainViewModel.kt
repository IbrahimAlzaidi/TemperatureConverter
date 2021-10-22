package com.example.temperatureconverter.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.temperatureconverter.model.Repository

class MainViewModel : ViewModel() {
    private val _celTemp = MutableLiveData<String>()
    val celsiusTemperature: LiveData<String>
        get() = _celTemp

    fun changeTemperature(fahrenTemp: CharSequence) {
        Repository.temperatureConvert(fahrenTemp.toString()).apply {
            _celTemp.postValue(String.format("%.1f", this))
        }
    }
}