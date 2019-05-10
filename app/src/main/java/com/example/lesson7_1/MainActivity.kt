package com.example.lesson7_1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var total: Int = 0
    var ave: Int = 0
    var Grade: String = ""
    var java: Int = 0
    var network: Int = 0
    var database: Int = 0


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonTotal.setOnClickListener{
            java = editTextJava.text.toString().toInt()
            network = editTextNetwork.text.toString().toInt()
            database = editTextDatabase.text.toString().toInt()
            total = editTextTotal.text.toString().toInt()
            ave = editTextAverage.text.toString().toInt()
            total = java + network + database
            editTextTotal.setText(total)
        }
        buttonAverage.setOnClickListener{
            ave = total / 3
            editTextAverage.setText(ave)
        }
    }
}
