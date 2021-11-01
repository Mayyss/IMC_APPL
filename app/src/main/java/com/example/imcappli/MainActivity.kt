package com.example.imcappli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // Pra esconder o toolbar/actionBar
        // escoder - hide
        //double bang => !!
        //Se tiver toolbar esconda, se não tiver faça nada
        supportActionBar!!.hide()

        val buttonContaNova = findViewById<Button>(R.id.button_conta_nova)

        buttonContaNova.setOnClickListener {
            val abrirNovoUsuario = Intent(this, Novo_Usuario_Activity::class.java)
            startActivity(abrirNovoUsuario)
        }
    }




}