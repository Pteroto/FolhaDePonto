package com.doubleg.folhadeponto.view

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.doubleg.folhadeponto.R

class CreateLoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_sign)


        val btnCreate = findViewById<Button>(R.id.btnCreate)

        btnCreate.setOnClickListener {


        }
    }
}