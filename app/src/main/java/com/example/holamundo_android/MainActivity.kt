package com.example.holamundo_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MisMensajes","Estoy en Oncreated")
    }

    override fun OnResume(savedInstanceState: Bundle?){
        super.onResume(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MisMensajes","Estoy en OnResume")
    }
}
