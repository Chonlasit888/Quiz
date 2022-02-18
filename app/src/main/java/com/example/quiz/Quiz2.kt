package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class Quiz2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz2)

        button1.setOnClickListener{
            val Intent = Intent(this,yes2::class.java)
            startActivity(Intent)
            finish()}

        button2.setOnClickListener{
            val Intent = Intent(this,no2::class.java)
            startActivity(Intent)
            finish()}

        button3.setOnClickListener{
            val Intent = Intent(this,no2::class.java)
            startActivity(Intent)
            finish()}

        button4.setOnClickListener{
            val Intent = Intent(this,no2::class.java)
            startActivity(Intent)
            finish()}
    }
}