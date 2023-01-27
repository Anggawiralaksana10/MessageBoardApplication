package com.example.miniproject

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private lateinit var edtusername: EditText
    private lateinit var edtpassword: EditText
    private lateinit var buttonlogin: Button
    private lateinit var tvregister: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtusername = findViewById(R.id.edtusername)
        edtpassword = findViewById(R.id.edtpassword)
        buttonlogin = findViewById(R.id.buttonlogin)
        tvregister = findViewById(R.id.tvregister)


        tvregister.setOnClickListener {
            val intent = Intent(this,register::class.java)
            startActivity(intent)
        }


    }

}
