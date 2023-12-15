package com.senai.vsconnect.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.RecyclerView
import com.senai.vsconnect.R
import com.senai.vsconnect.models.Servico

class MainActivity : AppCompatActivity() {
    private lateinit var novaRecyclerView: RecyclerView;
    private lateinit var novoArrayList:ArrayList<Servico>;

    lateinit var titulo: Array<String>;
    lateinit var descricao: Array<String>;
    lateinit var valor:Array<Float>;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val button = findViewById<Button>(R.id.buttonLogin);
        button.setOnClickListener {
            val intent = Intent(this, ListaServico::class.java);
            startActivity(intent);
        }

    }
}

