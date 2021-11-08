package com.example.imcappli

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

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
        val buttonEntrar = findViewById<Button>(R.id.button_entrar)
        val editText = findViewById<EditText>(R.id.edit_email)
        val editEmail = findViewById<EditText>(R.id.edit_email)
        val editSenha = findViewById<EditText>(R.id.edit_senha)

        buttonEntrar.setOnClickListener {
            //Abrimos o arquivo
            val arquivo = getSharedPreferences("usuario", MODE_PRIVATE)

            // Recuperamos o email e a senha de dentro do arquivo
            val email = arquivo.getString("email", "")
            val senha = arquivo.getString("senha", "")

            if(email == editEmail.text.toString() && senha == editSenha.text.toString()){
                val abrirDashboard = Intent(this, DashboardActivity::class.java)
                startActivity(abrirDashboard)
            }
            else{
                Toast.makeText(this, "Senha ou usuário incorretos!!", Toast.LENGTH_SHORT).show()
            }


        }

        buttonContaNova.setOnClickListener {
            val abrirNovoUsuario = Intent(this, Novo_Usuario_Activity::class.java)
            startActivity(abrirNovoUsuario)
        }
    }




}