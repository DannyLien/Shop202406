package com.tom.shop202406

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.firebase.auth.FirebaseAuth
import com.tom.shop202406.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setContentView(R.layout.activity_sign_up)
        binding.signup.setOnClickListener {
            val sEmail = binding.email.text.toString()
            val sPassword = binding.password.text.toString()
            FirebaseAuth.getInstance().createUserWithEmailAndPassword(sEmail, sPassword)
        }
    }
}