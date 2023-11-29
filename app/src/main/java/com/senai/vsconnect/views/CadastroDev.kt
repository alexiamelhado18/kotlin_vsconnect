package com.senai.vsconnect.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.senai.vsconnect.R

class CadastroDev : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val buttonCadastro: Button = findViewById(R.id.buttonCadastro)
        buttonCadastro.setOnClickListener {
            cadastrar()
        }

    }

    private fun cadastrar() {
        val editTextName: EditText = findViewById(R.id.editTextName)
        val editTextEmail: EditText = findViewById(R.id.editTextEmail)
        val editTextPassword: EditText = findViewById(R.id.editTextPassword)
        val editTextCep: EditText = findViewById(R.id.editTextCep)
        val editTextLogradouro: EditText = findViewById(R.id.editTextLogradouro)
        val editTextNumero: EditText = findViewById(R.id.editTextNumero)
        val editTextBairro: EditText = findViewById(R.id.editTextBairro)
        val editTextCidade: EditText = findViewById(R.id.editTextCidade)
        val editTextUF: EditText = findViewById(R.id.editTextUF)

        // Obtenha os valores dos campos
        val nome = editTextName.text.toString()
        val email = editTextEmail.text.toString()
        val senha = editTextPassword.text.toString()
        val cep = editTextCep.text.toString()
        val logradouro = editTextLogradouro.text.toString()
        val numero = editTextNumero.text.toString()
        val bairro = editTextBairro.text.toString()
        val cidade = editTextCidade.text.toString()
        val uf = editTextUF.text.toString()


        // Realize as ações de cadastro aqui (por exemplo, enviar para um servidor, salvar no banco de dados, etc.)
        Toast.makeText(this, "Cadastro com sucesso", Toast.LENGTH_LONG).show()
    }

}