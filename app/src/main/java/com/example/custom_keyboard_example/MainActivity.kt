package com.example.custom_keyboard_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.InputType
import android.view.View
import android.view.inputmethod.EditorInfo
import androidx.databinding.DataBindingUtil
import com.example.custom_keyboard_example.R
import com.example.custom_keyboard_example.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        showKeyboard()
        val ic = binding.etInput.onCreateInputConnection(EditorInfo())
        binding.keyboard.setInputConnection(ic)
    }

    private fun showKeyboard() {
        binding.etInput.visibility = View.VISIBLE
        binding.etInput.setRawInputType(InputType.TYPE_CLASS_TEXT)
        binding.etInput.setTextIsSelectable(true)
        binding.etInput.showSoftInputOnFocus = false
        binding.etInput.requestFocus()
    }
}