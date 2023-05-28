package com.example.test1

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.Spinner
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var dataFrom = findViewById<EditText>(R.id.editTextDate)
        var dataTo = findViewById<EditText>(R.id.editTextDate2)
        val arraySpinner = arrayOf(
            "Ежегодный основной", "Ежегодный дополнительный", "За счет сотрудника"
        )
        val spinner: Spinner = findViewById(R.id.spinner)
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_spinner_item, arraySpinner
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.setAdapter(adapter)
//        var editText = findViewById<EditText>(R.id.editTextinput)

    }
}