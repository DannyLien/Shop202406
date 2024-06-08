package com.tom.shop202406

import android.app.Activity
import android.content.Context
import androidx.appcompat.app.AppCompatActivity

fun Activity.setNickname(nickname: String) {
    getSharedPreferences("shop", Context.MODE_PRIVATE)
        .edit()
        .putString("NICKNAME", nickname)
        .apply()
}

fun Activity.getNickname(): String {
    return getSharedPreferences("shop", Context.MODE_PRIVATE).getString("NICKNAME","").toString()
}














