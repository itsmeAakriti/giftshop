package com.example.giftshop


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class splashActivity : AppCompatActivity() {
    private val splashScreen=3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spash)
        Handler().postDelayed({
            startActivity(intent)
            val intent = Intent(splashActivity@this, loginActivity::class.java)
            startActivity(intent)
            finish()
        },splashScreen.toLong())
    }
}


