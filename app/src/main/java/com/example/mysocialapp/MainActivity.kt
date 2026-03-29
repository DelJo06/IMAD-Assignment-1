package com.example.mysocialapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.EditText
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)}}
        val timeInput = findViewById<EditText>( id = R.id.edtTime)
        val btnEnter = findViewById<Button> ( id = R.id.btnEnter)
        val btnReset = findViewById<Button> ( id = R.id.btnReset)
        val txtResult = findViewById<TextView> ( id = R.id.txtResult)


        btnEnter.setOnClickListener {

            // input validation
            val time = timeInput.text.toString().trim().lowercase()

            if (time.isEmpty()){
                txtResult.text = "Please enter valid input"
            }
            else if (time == "morning"){
                txtResult.text = "Text a friend good morning."
            }
            else if (time == "afternoon"){
                txtResult.text = "text a friend asking how their day is going."
            }
            else if (time == "night"){
                txtResult.text = "Text a friend goodnight."
            }
            else {
                txtResult.text = "Please enter valid time"
            }
        }

        btnReset.setOnClickListener {
            timeInput.text.clear()
            txtResult.text = ""
        }