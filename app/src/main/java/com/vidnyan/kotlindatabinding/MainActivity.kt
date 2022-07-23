package com.vidnyan.kotlindatabinding

import android.arch.lifecycle.ViewModel
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.vidnyan.kotlindatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding
    lateinit var mainViewModel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mainViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        mainViewModel.employeeLiveData.observe(this, Observer { binding.employeeData })


        val employeeData = EmployeeData("Mr. Rambo","Fighter")

        binding.employeeData = employeeData

        println("this second commit for test")

        println("this is master branch")

    }
}