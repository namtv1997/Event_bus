package com.example.observerpattern

import android.app.IntentService
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import org.greenrobot.eventbus.EventBus

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnLogin.setOnClickListener {
            val a=edtEmail.text.toString().trim()
            val b=edtPass.text.toString().trim()

            EventBus.getDefault().post(MessageEvent(a,b))

            finish()

        }

    }



}
