package com.doubleg.folhadeponto

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnSign = findViewById<Button>(R.id.btnSign)

        btnSign.setOnClickListener {

            screenCreate()

        }

        btnLogin.setOnClickListener {

            screenHome()

        }



    }
    private fun screenCreate() {
        val sendIntent = Intent(this, CreateLoginActivity::class.java)
        startActivity(sendIntent)
    }

    private fun screenHome() {
        val sendIntent = Intent(this, MainActivity::class.java)
        startActivity(sendIntent)
    }
}