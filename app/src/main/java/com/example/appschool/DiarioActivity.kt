package com.example.appschool

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.appschool.databinding.ActivityDiarioBinding
import com.example.appschool.databinding.ActivityLoginBinding

class DiarioActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDiarioBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDiarioBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        window.statusBarColor = Color.parseColor("#FFFFFF")
    }
}