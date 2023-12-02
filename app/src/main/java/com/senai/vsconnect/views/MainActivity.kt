package com.senai.vsconnect.views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.senai.vsconnect.R

class MainActivity : AppCompatActivity() {
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

