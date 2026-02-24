package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
// --- CALCULADORA BÁSICA ---
        val n1 = findViewById<EditText>(R.id.num1)
        val n2 = findViewById<EditText>(R.id.num2)
        val resCalc = findViewById<TextView>(R.id.txtResultadoCalc)

        findViewById<Button>(R.id.btnSoma).setOnClickListener {
            val v1 = n1.text.toString().toDoubleOrNull() ?: 0.0
            val v2 = n2.text.toString().toDoubleOrNull() ?: 0.0
            resCalc.text = "Resultado: ${v1 + v2}"
        }

        findViewById<Button>(R.id.btnSub).setOnClickListener {
            val v1 = n1.text.toString().toDoubleOrNull() ?: 0.0
            val v2 = n2.text.toString().toDoubleOrNull() ?: 0.0
            resCalc.text = "Resultado: ${v1 - v2}"
        }

        findViewById<Button>(R.id.btnMult).setOnClickListener {
            val v1 = n1.text.toString().toDoubleOrNull() ?: 0.0
            val v2 = n2.text.toString().toDoubleOrNull() ?: 0.0
            resCalc.text = "Resultado: ${v1 * v2}"
        }

        findViewById<Button>(R.id.btnDiv).setOnClickListener {
            val v1 = n1.text.toString().toDoubleOrNull() ?: 0.0
            val v2 = n2.text.toString().toDoubleOrNull() ?: 1.0
            resCalc.text = "Resultado: ${v1 / v2}"
        }

// --- LEI DE OHM ---
        val editR = findViewById<EditText>(R.id.editR)
        val editI = findViewById<EditText>(R.id.editI)
        val resOhm = findViewById<TextView>(R.id.txtResultadoOhm)

        findViewById<Button>(R.id.btnOhm).setOnClickListener {
            val r = editR.text.toString().toDoubleOrNull() ?: 0.0
            val i = editI.text.toString().toDoubleOrNull() ?: 0.0
            val v = r * i
            resOhm.text = "Voltagem: $v V"
        }





        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


}