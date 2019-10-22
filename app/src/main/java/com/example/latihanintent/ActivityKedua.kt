package com.example.latihanintent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_kedua.*

class ActivityKedua : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kedua)

        val intent = intent
        val nim = intent.getStringExtra("Nim")
        val nama = intent.getStringExtra("Nama")
        val nilai = intent.getStringExtra("Nilai")
        var nilai2 = nilai.toInt()

        if (nilai2 >= 80){
            tvData4.setText("A")
        }
        else if(nilai2 >= 60){
            tvData4.setText("B")
        }
        else if(nilai2 >= 40){
            tvData4.setText("C")
        }
        else if(nilai2 >= 20){
            tvData4.setText("D")
        }
        else{
            tvData4.setText("E")
        }

        val tvData1 = findViewById<TextView>(R.id.tvData1)
        val tvData2 = findViewById<TextView>(R.id.tvData2)
        val tvData3 = findViewById<TextView>(R.id.tvData3)


        tvData1.text = "Nim : "+nim
        tvData2.text = "Nama : "+nama
        tvData3.text = "Nilai : "+nilai


    }
}
