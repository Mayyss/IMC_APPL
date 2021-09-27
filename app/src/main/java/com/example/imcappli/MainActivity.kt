package com.example.imcappli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Pra esconder o toolbar/actionBar
        // escoder - hide
        //double bang => !!
        //Se tiver toolbar esconda, se não tiver faça nada
        supportActionBar!!.hide()
    }
}