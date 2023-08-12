package com.example.myfirstapplication

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

        val btnCalcular:Button = findViewById<Button>(R.id.btnCalcular)
        val textMsgPeso:EditText = findViewById<EditText>(R.id.edtMsgPeso)
        val textMsgAltura:EditText = findViewById<EditText>(R.id.edtMsgAltura)


        btnCalcular.setOnClickListener {
            val peso_str = textMsgPeso.text.toString()
            val altura_str = textMsgAltura.text.toString()

            if (peso_str.isNotEmpty() && altura_str.isNotEmpty()) {
                val peso = peso_str.toFloat()
                val altura = altura_str.toFloat()
                val alturaFinal = altura * altura
                val imc: Float = peso / (alturaFinal)

                val intent = Intent(this, ResultActivity::class.java)

                    .apply {
                        putExtra("EXTRA_RESULT", imc)
                    }

                startActivity(intent)
            }else{
                Toast.makeText(this, "Preencher todos os campos", Toast.LENGTH_LONG).show()
            }
        }

    }
}