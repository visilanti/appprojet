package com.example.malnavigation.ui.mylist

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MylistViewModel : ViewModel() {
    private val _text = MutableLiveData<String>().apply {
        value = "This is my list Fragment"
    }
    val text: LiveData<String> = _text
}