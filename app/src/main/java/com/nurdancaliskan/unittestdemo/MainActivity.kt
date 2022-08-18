package com.nurdancaliskan.unittestdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    var temp = -1;

    val addBtn = findViewById<Button>(R.id.btn_add)
    val subBtn = findViewById<Button>(R.id.btn_sub)
    val clearBtn = findViewById<Button>(R.id.btn_clear)
    val baseNumberEtext = findViewById<EditText>(R.id.etxt_base_number)
    val addNumberEtext = findViewById<EditText>(R.id.etxt_number)
    val resultTxt = findViewById<TextView>(R.id.txt_result)

    val calculator: Calculator = Calculator()

    addBtn.setOnClickListener() {
        val baseNumber = baseNumberEtext.text.toString().toInt()
        val addNumber = addNumberEtext.text.toString().toInt()
        var result = resultTxt.text.toString().toInt()
        resultTxt.setText(calculator.add(baseNumber, addNumber, result).toString())
    }
    subBtn.setOnClickListener() {
        val baseNumber = baseNumberEtext.text.toString().toInt()
        val addNumber = addNumberEtext.text.toString().toInt()
        var result = resultTxt.text.toString().toInt()
        temp++
        resultTxt.setText(calculator.sub(baseNumber, addNumber, result, temp).toString())

    }
    clearBtn.setOnClickListener() {
        clear(baseNumberEtext, addNumberEtext, resultTxt)
    }
    addBtn.setOnLongClickListener() {
        resultTxt.setText("Add Button")
        resultTxt.setBackgroundColor(Color.GRAY)
        true
    }
    subBtn.setOnLongClickListener() {
        resultTxt.setText("Sub Button")
        resultTxt.setBackgroundColor(Color.RED)
        true
    }
    clearBtn.setOnLongClickListener() {
        resultTxt.setText("Clear Button")
        resultTxt.setBackgroundColor(Color.DKGRAY)
        true
    }
}

fun clear(baseNumberEtxt: EditText, addNumberEtxt: EditText, resultTxt: TextView) {
    baseNumberEtxt.text.clear()
    addNumberEtxt.text.clear()
    resultTxt.text = "0"
}
    }