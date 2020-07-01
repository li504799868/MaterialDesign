package com.lzp.materialdesign

import android.app.Activity
import android.content.Intent

inline fun <reified T> Activity.start(){
    val intent = Intent(this, T::class.java)
    this.startActivity(intent)
}