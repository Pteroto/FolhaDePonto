package com.doubleg.folhadeponto.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.viewModels
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import com.doubleg.folhadeponto.R
import com.doubleg.folhadeponto.presentation.LoginViewModel
import com.doubleg.folhadeponto.presentation.LoginViewModelFactory

class LoginActivity : AppCompatActivity() {
    private val viewModel: LoginViewModel by viewModels {
        LoginViewModelFactory()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        setObservables()

        val btnLogin = findViewById<Button>(R.id.btnLogin)
        val btnSign = findViewById<Button>(R.id.btnSign)
        val loginText = findViewById<EditText>(R.id.editTextLogin).text.toString()
        val passwordText = findViewById<EditText>(R.id.editTextPassword).text.toString()

        btnSign.setOnClickListener {
            goToScreenCreate()
        }

        btnLogin.setOnClickListener {
            viewModel.verifyLogin(loginText, passwordText)
        }
    }

    private fun setObservables() {
        viewModel.loginStatus.observe(this) {
            if (!it) {
                AlertDialog.Builder(this)
                    .setTitle("Erro")
                    .setMessage("Usuário não existe")
                    .setPositiveButton(
                        "Ok"
                    ) { dialog, _ -> dialog.dismiss() }
                    .create()
                    .show()
            } else {
                goToScreenHome()
            }
        }
    }

    private fun goToScreenCreate() {
        val sendIntent = Intent(this, CreateLoginActivity::class.java)
        startActivity(sendIntent)
    }

    private fun goToScreenHome() {
        val sendIntent = Intent(this, MainActivity::class.java)
        startActivity(sendIntent)
    }
}