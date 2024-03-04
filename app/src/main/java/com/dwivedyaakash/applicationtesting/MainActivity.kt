package com.dwivedyaakash.applicationtesting

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dwivedyaakash.applicationtesting.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // UI testing using espresso
        val changeTextButton = binding.changeNumberButton
        val changeTextTextView = binding.changeNumber
        var i = 1
        fun changeText() {
            changeTextTextView.text=i.toString()
            i++
        }
        changeTextButton.setOnClickListener { changeText() }

    }
}