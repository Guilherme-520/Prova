package com.example.prova

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        // Access a Cloud Firestore instance from your Activity

        val db = Firebase.firestore

        val btnCad: Button = findViewById(R.id.btnCad)
        val bairro: EditText = findViewById(R.id.bairro)
        val endereco: EditText = findViewById(R.id.endereco)
        val cep: EditText = findViewById(R.id.cep)
        val nome: EditText = findViewById(R.id.nome)


        // Create a new user with a first and last name
        val pessoa = hashMapOf(
            "nome" to nome.text.toString(),
            "bairro" to bairro.text.toString(),
            "endereco" to endereco.text.toString(),
            "cep" to endereco.text.toString()
        )

// Add a new document with a generated ID
        db.collection("cadastro")
            .add(pessoa)
            .addOnSuccessListener { documentReference ->
                Log.d(TAG, "DocumentSnapshot added with ID: ${documentReference.id}")
            }
            .addOnFailureListener { e ->
                Log.w(TAG, "Error adding document", e)
            }

    }
}