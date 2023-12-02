package com.senai.vsconnect.views

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.senai.vsconnect.R

class ListaServico : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_servico)

        // Referencie a RecyclerView do seu layout
        val recyclerView: RecyclerView = findViewById(R.id.lista_servico);

        // Configure o LayoutManager para um LinearLayoutManager com orientação horizontal
        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.layoutManager = layoutManager;

        // Substitua "SeuAdapter" pelo nome do seu adapter
        // val adapter = SeuAdapter()
        //recyclerView.adapter = adapter
    }
}