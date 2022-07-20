package com.vidnyan.kotlindatabinding

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    val employeeLiveData = MutableLiveData("Mr. john wick")

    fun updateEmployee(){
        employeeLiveData.value = "Mr. maverick"
    }
}