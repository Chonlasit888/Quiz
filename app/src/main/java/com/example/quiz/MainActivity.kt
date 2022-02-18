package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button3.setOnClickListener{
            val Intent = Intent(this,yes::class.java)
            startActivity(Intent)
            finish()}

        button1.setOnClickListener{
            val Intent = Intent(this,no::class.java)
            startActivity(Intent)
            finish()}

        button2.setOnClickListener{
            val Intent = Intent(this,no::class.java)
            startActivity(Intent)
            finish()}

        button4.setOnClickListener{
            val Intent = Intent(this,no::class.java)
            startActivity(Intent)
            finish()}


    }
}
