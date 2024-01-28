package com.example.laba1mobile

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    @SuppressLint("SetTextI18n")
    fun result(v : View){
        val number1 : EditText = findViewById(R.id.firstNumber)
        val number2 : EditText = findViewById(R.id.secondNumber)
        val result : TextView = findViewById(R.id.resultText)

        try {
            when (v.id) {
                R.id.SummaBtn -> {
                    val resultInt: Int = number1.text.toString().toInt() + number2.text.toString().toInt()
                    result.text = "${number1.text} + ${number2.text} = $resultInt"
                }
                R.id.minusBtn -> {
                    val resultInt: Int = number1.text.toString().toInt() - number2.text.toString().toInt()
                    result.text = "${number1.text} - ${number2.text} = $resultInt"
                }
                R.id.multiplyBtn -> {
                    val resultInt: Int = number1.text.toString().toInt() * number2.text.toString().toInt()
                    result.text = "${number1.text} x ${number2.text} = $resultInt"
                }
                R.id.delenieBtn -> {
                    val resultInt: Double = number1.text.toString().toDouble() / number2.text.toString().toDouble()
                    result.text = "${number1.text} / ${number2.text} = $resultInt"
                }
            }
        }
        catch(e: Exception){
            val toast = Toast.makeText(this, "Введите все числа", Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}