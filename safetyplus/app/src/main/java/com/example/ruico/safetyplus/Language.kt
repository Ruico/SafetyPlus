package com.example.ruico.safetyplus

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_language.*

class Language : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_language)

        var flag = false

        buttonJp.setOnClickListener {
            if (flag) {
                // flagがtrueの時
                checkImage.setImageResource(R.drawable.drive6)
                flag = false
            }

        }
    }
}
