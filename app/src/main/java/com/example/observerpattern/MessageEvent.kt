package com.example.observerpattern

import android.app.IntentService
import android.content.Intent
import android.app.Activity
import org.greenrobot.eventbus.EventBus



data class MessageEvent(var userNameOrEmail:String?,var password:String?){


}