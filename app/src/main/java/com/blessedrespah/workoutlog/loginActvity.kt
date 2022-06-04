package com.blessedrespah.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
class loginActvity : AppCompatActivity() {
    lateinit var etEmail: TextInputEditText
    lateinit var tilEmail: TextInputEditText
    lateinit var etPassword: TextInputEditText
    lateinit var tilPassword: TextInputEditText
    lateinit var btnLogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_actvity)
        btnLogin=findViewById(R.id.btnLogin)
        tilPassword=findViewById(R.id.tilPassword)

        tilEmail=findViewById(R.id.tilEmail)
        etPassword=findViewById(R.id.etPassword)
        etEmail=findViewById(R.id.etEmail)
        btnLogin.setOnClickListener {validatelogin() }

    }

    fun validatelogin() {
        var error = false
        tilEmail.error =null
        tilPassword.error = null
        var email = etEmail.text.toString()
        if (email.isBlank()) {
            tilEmail.error = "Email is required"
            error = true
        }
        var password=etPassword.text.toString()

        if (password.isBlank()) {
            tilPassword.error = "password is required"
            error = true
        }

    }
}

