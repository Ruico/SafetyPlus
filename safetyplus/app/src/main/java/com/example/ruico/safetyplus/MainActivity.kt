package com.example.ruico.safetyplus

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: Button = findViewById(R.id.button)
        button.setOnClickListener {
            val intent = Intent(this, Gengo::class.java)
            startActivity(intent)


        }
        val button9: Button = findViewById(R.id.button9)
        button9.setOnClickListener{
            val intent = Intent( this, Oil_Seeds::class.java)
            startActivity(intent)

        }
        val imageButton: ImageButton = findViewById(R.id.imageButton)
        imageButton.setOnClickListener {
            val intent = Intent(this, Drive::class.java)
            startActivity(intent)
        }
    }
}