package com.example.observerpattern

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main2.*
import org.greenrobot.eventbus.EventBus
import org.greenrobot.eventbus.Subscribe
import org.greenrobot.eventbus.ThreadMode

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        EventBus.getDefault().register(this)
        btnSignUp.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }


    }

    @Subscribe(threadMode = ThreadMode.MAIN)
    fun getMessageEvent(messageEvent: MessageEvent) {
        edtUsername.setText(messageEvent.userNameOrEmail)
        edtPassWord.setText(messageEvent.password)
        edtRePassWord.setText(messageEvent.password)


    }


    override fun onDestroy() {
        super.onDestroy()
        EventBus.getDefault().unregister(this)
    }
}
