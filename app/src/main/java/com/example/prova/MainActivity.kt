package com.example.prova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Access a Cloud Firestore instance from your Activity

        val db = Firebase.firestore

        val btnCad: Button = findViewById(R.id.btnCad)
        val Bairro: EditText = findViewById(R.id.bairro)
        val endereco: EditText = findViewById(R.id.endereco)
        val cep: EditText = findViewById(R.id.cep)
        val nome: EditText = findViewById(R.id.nome)

    }
}