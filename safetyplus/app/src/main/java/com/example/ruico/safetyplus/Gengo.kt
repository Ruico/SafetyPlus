package com.example.ruico.safetyplus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_gengo.*

class Gengo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gengo)

        var flag = false

        button7.setOnClickListener {
            if (flag) {
                // flagがtrueの時
                imageView2.setImageResource(R.drawable.drive6)
                flag = false

        }
    }
}
