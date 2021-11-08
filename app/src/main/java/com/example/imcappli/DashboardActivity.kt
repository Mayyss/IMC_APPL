package com.example.imcappli

import android.os.Bundle
import android.os.PersistableBundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class DashboardActivity : AppCompatActivity() {

    lateinit var tvNome : TextView
    lateinit var tvProfissao : TextView
    lateinit var tvAltura : TextView

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.dashboard)

        tvNome = findViewById(R.id.tv_dash_nome)
        tvProfissao = findViewById(R.id.tv_dash_profissao)
        tvAltura = findViewById(R.id.tv_dash_altura)


        preencherDashboard()

    }

    private fun preencherDashboard(){
        val arquivo = getSharedPreferences("usuario", MODE_PRIVATE)
        tvNome.text = arquivo.getString("nome", "")
        tvProfissao.text = arquivo.getString("profissao", "")
        tvAltura.text =  arquivo.getFloat("altura", 0.0f).toString()
        supportActionBar!!.hide()
    }
}