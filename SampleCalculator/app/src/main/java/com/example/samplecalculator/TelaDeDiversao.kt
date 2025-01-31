package com.example.samplecalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.TranslateAnimation
import android.widget.ImageView

class TelaDeDiversao : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela_de_diversao)

        // Referência para a imagem
        val imageView: ImageView = findViewById(R.id.imageView)

        // Definindo a animação de translação (da esquerda para a direita)
        val animation = TranslateAnimation(
            0f,  // Posição inicial (no eixo X)
            1000f, // Posição final (no eixo X)
            0f,   // Posição inicial (no eixo Y)
            0f    // Posição final (no eixo Y)
        )

        animation.duration = 2000  // Duração de 2 segundos
        animation.repeatCount = TranslateAnimation.INFINITE  // A animação vai se repetir infinitamente
        animation.repeatMode = TranslateAnimation.REVERSE  // A animação vai reverter (voltar para a posição inicial)

        // Aplicando a animação no ImageView
        imageView.startAnimation(animation)
    }
}
