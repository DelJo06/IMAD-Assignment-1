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
        setContentView(R.layout.activity_main)

        // Fixed: Removed "id =" which isn't allowed here, and added explicit types
        val timeInput: EditText = findViewById(R.id.edtTime)
        val btnEnter: Button = findViewById(R.id.btnEnter)
        val btnReset: Button = findViewById(R.id.btnReset)
        val txtResult: TextView = findViewById(R.id.txtResult)

        btnEnter.setOnClickListener {

            // input validation
            val time = timeInput.text.toString().trim().lowercase()

            if (time.isEmpty()) {
                txtResult.text = "Please enter valid input"
            } else if (time == "morning") {
                txtResult.text = "Text a friend good morning."
            } else if (time == "afternoon") {
                txtResult.text = "text a friend asking how their day is going."
            } else if (time == "night") {
                txtResult.text = "Text a friend goodnight."
            } else {
                txtResult.text = "Please enter valid time"
            }
        }

        btnReset.setOnClickListener {
            timeInput.text.clear()
            txtResult.text = ""
        }
    }
}