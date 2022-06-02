package com.blessedrespah.workoutlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import java.lang.Error

class loginActvity : AppCompatActivity() {
     lateinit var etEmail: TextInputEditText
     lateinit var tilEmail: TextInputLayout
    lateinit var Password: TextInputLayout
    lateinit var etpassword: TextInputEditText
    lateinit var btnlogin:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_actvity)
        btnlogin=findViewById(R.id.btnLogin)
        tilEmail=findViewById(R.id.tilEmail)
        Password=findViewById(R.id.Password)
        etEmail=findViewById(R.id.etEmail)
    }
    fun validatelogin() {
        var error = false
        tilEmail.error =null
        Password.error = null
        var email = etEmail.text.toString()
        if (email.isBlank()) {
            tilEmail.error = "Email is required"
            error = true
        }
        var password = etpassword.text.toString()
        if (password.isBlank()) {
            Password.error = "password is required"
            btnlogin.setOnClickListener { }
            error = true
        }
    }
}
//     app:layout_constraintBottom_toBottomOf="parent"
//app:layout_constraintTop_toTopOf="parent"
