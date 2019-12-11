package com.example.intentapplication02

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    val REQ_USER_LOGIN = 1000
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        loginBtn.setOnClickListener {
            intent = Intent(this,MainActivity::class.java)

            intent.putExtra("userId",idEdt.text.toString())
            startActivity(intent)
        }
    }
}
