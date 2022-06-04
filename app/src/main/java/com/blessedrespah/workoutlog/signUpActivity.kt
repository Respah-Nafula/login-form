package com.blessedrespah.workoutlog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class signUpActivity : AppCompatActivity() {
    lateinit var btnsignup: Button
    lateinit var tvLogin:TextView
    lateinit var tiltfirstname: TextInputLayout
    lateinit var etfirstname:TextInputEditText
    lateinit var tillastname: TextInputLayout
    lateinit var etlastname:TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var etEmail:TextInputEditText
    lateinit var tilpassword: TextInputLayout
    lateinit var etpassword:TextInputEditText
    lateinit var tilconfirmpassword: TextInputLayout
    lateinit var etconfirmpassword:TextInputEditText



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)
        btnsignup=findViewById(R.id.btnsignup)
        tiltfirstname=findViewById(R.id.tilfirstname)
        etfirstname=findViewById(R.id.etfirstname)
        tilEmail=findViewById(R.id.tilEmail)
        etEmail=findViewById(R.id.etEmail)
        tilpassword=findViewById(R.id.tilpassword)
        etpassword=findViewById(R.id.etPassword)
        tilconfirmpassword=findViewById(R.id.tilconfirmpassword)
        etconfirmpassword=findViewById(R.id.etconfirmpassword)
        tvLogin.setOnClickListener {
            var intent=Intent(this,loginActvity::class.java)
            startActivity(intent)
        }
        btnsignup.setOnClickListener {
            validatesignup()
        }
    }

    private fun validatesignup() {
        var error = false
        tilpassword.error = null
        tilconfirmpassword.error = null
        var firstname = etfirstname.text.toString()
        var lastname=etlastname.text.toString()
        var Email=etEmail.text.toString()
        var password=etpassword.text.toString()
        var confirmpassword=etconfirmpassword.text.toString()
        if (firstname.isBlank()) {
            tiltfirstname.error = "password is required"
            error = true
        }
        if(lastname.isBlank()){
            tillastname.error="lastname is required"
            error=true
        }
        if(Email.isBlank()){
            tilEmail.error="Email is required"
            error=true
        }
        if(password.isBlank()){
            tilpassword.error="password is required"
            error=true
        }
        if(confirmpassword.isBlank()){
            tilconfirmpassword.error="confirm password is required"
            error=true
        }
        if(!error){

    }
    }
}