package com.example.samplecalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class TelaSobre : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_sobre)
    }

    fun voltarTelaInicial(view: View){
        var telaInicial = Intent(this, MainActivity::class.java)
        startActivity(telaInicial)
    }
}