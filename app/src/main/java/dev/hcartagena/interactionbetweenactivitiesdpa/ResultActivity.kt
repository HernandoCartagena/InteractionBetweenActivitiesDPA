package dev.hcartagena.interactionbetweenactivitiesdpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val mensaje:String =intent.getStringExtra("paramNombreCompleto").toString()
        val tvResultado: TextView=findViewById(R.id.tvResult)
        val btnIrAtras:Button=findViewById((R.id.btnBack))
        tvResultado.text=mensaje

        btnIrAtras.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}