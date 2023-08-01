package com.example.samplecalculator

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var resposta : EditText
    private lateinit var numeroUm : EditText
    private lateinit var numeroDois : EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        resposta = findViewById(R.id.resposta)
        numeroUm = findViewById(R.id.numeroUm)
        numeroDois = findViewById(R.id.numeroDois)
    }

    fun imprimirResposta(valorResposta: Double){
        resposta.setText((valorResposta).toString())
    }

    fun somar(view: View?) {
        var valorUm = numeroUm.text.toString().toDouble()
        var valorDois = numeroDois.text.toString().toDouble()
        var valorResposta: Double = valorUm + valorDois
        imprimirResposta(valorResposta)
    }

    fun dividir(view: View?) {
        var valorUm = numeroUm.text.toString().toDouble()
        var valorDois = numeroDois.text.toString().toDouble()
        var valorResposta: Double = valorUm / valorDois
        imprimirResposta(valorResposta)
    }

    fun multiplicar(view: View?) {
        var valorUm = numeroUm.text.toString().toDouble()
        var valorDois = numeroDois.text.toString().toDouble()
        var valorResposta: Double = valorUm * valorDois
        imprimirResposta(valorResposta)
    }

    fun subtrair(view: View?) {
        var valorUm = numeroUm.text.toString().toDouble()
        var valorDois = numeroDois.text.toString().toDouble()
        var valorResposta: Double = valorUm - valorDois
        imprimirResposta(valorResposta)
    }


    fun porcentagem(view: View?) {
        var valorUm = numeroUm.text.toString().toDouble()
        var valorDois = numeroDois.text.toString().toDouble()
        var valorResposta: Double = (valorUm/100)*valorDois
        imprimirResposta(valorResposta)
    }

    fun abrirTelaSobre(view: View){
        var telaSobre = Intent(this, TelaSobre::class.java)
        startActivity(telaSobre)
    }

}