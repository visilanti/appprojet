package com.example.malnavigation.ui.seasonal

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SeasonalViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is Seasonal Fragment"
    }
    val text: LiveData<String> = _text
}