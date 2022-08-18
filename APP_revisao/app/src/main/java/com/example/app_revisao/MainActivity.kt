package com.example.app_revisao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txtNome: TextView = findViewById(R.id.edtNome)
        val txtEndereco:TextView = findViewById(R.id.edtEndereco)
        val txtCep:TextView = findViewById(R.id.edtCep)
        val txtBairro:TextView = findViewById(R.id.edtBairro)
        val btnCadastrar: Button = findViewById(R.id.btnCadastrar)


        btnCadastrar.setOnClickListener{Toast.makeText(this, "Nome: " + txtNome.text.toString() +" Endereço: " + txtEndereco.text.toString() +"\n Bairro: " + txtBairro.text.toString() +" Cep: " + txtCep.text.toString(), Toast.LENGTH_LONG).show()

            val intent = Intent(this, outraPG::class.java)
            startActivity(intent)
        }

    }

}//