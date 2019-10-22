package com.example.latihanintent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvNim = findViewById<EditText>(R.id.tvNim)
        val tvNama = findViewById<EditText>(R.id.tvNama)
        val tvNilai = findViewById<EditText>(R.id.tvNilai)
        val btnProses = findViewById<Button>(R.id.btnProses)

        btnProses.setOnClickListener {
            val nim = tvNim.text.toString()
            val nama = tvNama.text.toString()
            val nilai = tvNilai.text.toString()

            val intent = Intent(this@MainActivity, ActivityKedua ::class.java)
            intent.putExtra("Nim", nim)
            intent.putExtra("Nama", nama)
            intent.putExtra("Nilai", nilai)
            startActivity(intent)
        }
    }
}
