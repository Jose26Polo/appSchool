package com.example.appschool

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.appschool.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        window.statusBarColor = Color.parseColor("#5271ff")


        //Eventos
        binding.viewAgenda.setOnClickListener(this)
        binding.viewBoletim.setOnClickListener(this)
        binding.viewChat.setOnClickListener(this)
        binding.viewDiario.setOnClickListener(this)

    }
    override fun onClick(v: View) {
        lateinit var intent: Intent
        if ( v.id == R.id.view_diario) {
            intent = Intent(this,DiarioActivity::class.java)
        } else if ( v.id == R.id.view_agenda) {
            intent = Intent(this,AgendaActivity::class.java)
        }
        startActivity(intent)
    }
}
