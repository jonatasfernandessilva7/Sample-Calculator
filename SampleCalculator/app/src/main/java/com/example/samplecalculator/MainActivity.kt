package com.example.samplecalculator

import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resposta : EditText;
    private lateinit var numeroUm : EditText;
    private lateinit var numeroDois : EditText;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resposta = findViewById(R.id.resposta)
        numeroUm = findViewById(R.id.numeroUm)
        numeroDois = findViewById(R.id.numeroDois)
    }

    fun somar(view: View?) {
        val valorUm = numeroUm.text.toString().toInt()
        val valorDois = numeroDois.text.toString().toInt()
        resposta.setText((valorUm + valorDois).toString())
    }

    fun dividir(view: View?) {
        val valorUm = numeroUm.text.toString().toInt()
        val valorDois = numeroDois.text.toString().toInt()
        resposta.setText((valorUm / valorDois).toString())
    }

    fun multiplicar(view: View?) {
        val valorUm = numeroUm.text.toString().toInt()
        val valorDois = numeroDois.text.toString().toInt()
        resposta.setText((valorUm * valorDois).toString())
    }

    fun subtrair(view: View?) {
        val valorUm = numeroUm.text.toString().toInt()
        val valorDois = numeroDois.text.toString().toInt()
        resposta.setText((valorUm - valorDois).toString())
    }


    fun porcentagem(view: View?) {
        val valorUm = numeroUm.text.toString().toInt()
        val valorDois = numeroDois.text.toString().toInt()
        resposta.setText(((valorUm / valorDois)*1).toString())
    }


}