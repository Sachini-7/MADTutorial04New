package com.example.firstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var edtName:EditText
    lateinit var btnWelcome:Button
    lateinit var btnGoodBye:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        edtName = findViewById(R.id.edtName)
        btnWelcome = findViewById(R.id.btnWelcome)
        btnGoodBye = findViewById(R.id.btnGoodBye)

        btnWelcome.setOnClickListener {
            sayHello()
        }

        btnGoodBye.setOnClickListener {
            sayGoodBye()
        }
    }

    private fun sayGoodBye() {
        Toast.makeText(this, "Good Bye, ${edtName.text.toString()}", Toast.LENGTH_LONG).show()
    }

    private fun sayHello() {
        Toast.makeText(this, "Hello, ${edtName.text.toString()}", Toast.LENGTH_LONG).show()
    }
}