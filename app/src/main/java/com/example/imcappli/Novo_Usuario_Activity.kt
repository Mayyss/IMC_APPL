package com.example.imcappli

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu

class Novo_Usuario_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo__usuario_)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_novo_usuario,menu)

        return true
    }
}