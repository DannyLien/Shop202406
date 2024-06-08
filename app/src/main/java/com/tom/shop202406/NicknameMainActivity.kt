package com.tom.shop202406

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.tom.shop202406.databinding.ActivityNicknameMainBinding

class NicknameMainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityNicknameMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_nickname_main)
        binding = ActivityNicknameMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.done.setOnClickListener {
            //TODO: nickname
            getSharedPreferences("shop", MODE_PRIVATE)
                .edit()
                .putString("NICKNAME", binding.nick.text.toString())
                .apply()
            setResult(RESULT_OK)
            finish()
        }
    }
}