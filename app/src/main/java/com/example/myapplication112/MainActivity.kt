package com.example.myapplication112

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.databinding.DataBindingUtil
import com.example.myapplication112.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val viewModel : ZViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val binding: ActivityMainBinding =
            DataBindingUtil.setContentView(
            this, R.layout.activity_main)

        binding.lifecycleOwner = this@MainActivity

        binding.viewModel = viewModel
    }

}