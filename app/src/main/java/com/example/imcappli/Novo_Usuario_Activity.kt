package com.example.imcappli

import android.app.DatePickerDialog
import android.icu.util.Calendar
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuItem
import android.widget.EditText
import android.widget.RadioButton

class Novo_Usuario_Activity : AppCompatActivity() {
    //Declaração de variáveis
    //Inicialização tardia/atrasada vai se inicializada depois
    lateinit var editEmail : EditText
    lateinit var editSenha : EditText
    lateinit var editNome : EditText
    lateinit var editProfissao : EditText
    lateinit var editAltura : EditText
    lateinit var editDataNascimento: EditText
    lateinit var radioFeminino : RadioButton
    lateinit var radioMasculino : RadioButton

    //A primeira coisa que é executada é o OnCreate
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_novo__usuario_)

        //Instanciando
        editEmail = findViewById(R.id.edit_email)
        editSenha = findViewById(R.id.edit_senha)
        editNome = findViewById(R.id.edit_nome)
        editProfissao = findViewById(R.id.edit_profissao)
        editAltura = findViewById(R.id.edit_altura)
        editDataNascimento = findViewById(R.id.edit_data_nascimento)
        radioFeminino = findViewById(R.id.radio_feminino)
        radioMasculino = findViewById(R.id.radio_masculino)

        supportActionBar!!.title = "Nova Conta"




        // Colocar um Listener de click no editText Data de nascimento
        // Pra abri o calendário (DatePicker)
        editDataNascimento.setOnClickListener {
            //Criar um calendário para a dataNascimento
            criarDatePicker()
            }

            /*//Precisa passar um contexto e o listener(que vai acontecer quando for colocado a data)
            // Precisa passar tb o que irá aparecer inicialmente
            val datePicker = DatePickerDialog(
                    this,
                        DatePickerDialog.OnDateSetListener{view, _ano, _mes, _dia ->
                            var mesReal = _mes + 1

                            var diaString = ""
                            var mesString = ""
                            // Teste lógico para adicionar o 0 a esquerda
                            if(mesReal < 10){
                                mesString = "0$mesReal"
                            }

                            // Teste lógico para adicionar o 0 a esquerda
                            if(_dia < 10){
                                diaString = "0$dia"
                            }

                            // Concatena
                            // Coloca o $ - para trazer o valor da variável
                            Log.i("XXXX", "$diaString/$mesString/$_ano")
                            // Para aparecer no editText
                            editDataNascimento.setText("$diaString/$mesString/$_ano")
            }, ano, mes, dia)

            datePicker.show()
            */

        }

    fun criarDatePicker(){

        // *** Obter a data atual (hoje)
        val calendario = java.util.Calendar.getInstance()
        // Tem que obter a data atual para que quando abrir o calendario apareça do dia atual
        val dia = calendario.get(java.util.Calendar.DAY_OF_MONTH)
        val mes = calendario.get(java.util.Calendar.MONTH)
        val ano = calendario.get(java.util.Calendar.YEAR)

        //Precisa passar um contexto e o listener(que vai acontecer quando for colocado a data)
        // Precisa passar tb o que irá aparecer inicialmente
        val datePicker = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener{view, _ano, _mes, _dia ->
                    var mesReal = _mes + 1

                    var diaString = ""
                    var mesString = ""
                    // Teste lógico para adicionar o 0 a esquerda
                    if(mesReal < 10){
                        mesString = "0$mesReal"
                    }

                    // Teste lógico para adicionar o 0 a esquerda
                    if(_dia < 10){
                        diaString = "0$dia"
                    }

                    // Concatena
                    // Coloca o $ - para trazer o valor da variável
                    Log.i("XXXX", "$diaString/$mesString/$_ano")
                    // Para aparecer no editText
                    editDataNascimento.setText("$diaString/$mesString/$_ano")
                }, ano, mes, dia)

        datePicker.show()

    }

    private fun criarDatePicker(dia: Int, ano: Int, mes: Int) {
        //Precisa passar um contexto e o listener(que vai acontecer quando for colocado a data)
        // Precisa passar tb o que irá aparecer inicialmente
        val datePicker = DatePickerDialog(
                this,
                DatePickerDialog.OnDateSetListener { view, _ano, _mes, _dia ->
                    var mesReal = _mes + 1

                    var diaString = ""
                    var mesString = ""
                    // Teste lógico para adicionar o 0 a esquerda
                    if (mesReal < 10) {
                        mesString = "0$mesReal"
                    }

                    // Teste lógico para adicionar o 0 a esquerda
                    if (_dia < 10) {
                        diaString = "0$dia"
                    }

                    // Concatena
                    // Coloca o $ - para trazer o valor da variável
                    Log.i("XXXX", "$diaString/$mesString/$_ano")
                    // Para aparecer no editText
                    editDataNascimento.setText("$diaString/$mesString/$_ano")
                }, ano, mes, dia)

        datePicker.show()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        //return super.onCreateOptionsMenu(menu)
        menuInflater.inflate(R.menu.menu_novo_usuario,menu)

        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(validarCampos()){
            //gravar os dados
        }
        else{
            // grava nada
        }


        return true
    }

    private fun validarCampos() : Boolean{
        var valido = true

        if(editEmail.text.isEmpty()){
            editEmail.error = "E-mail é obrigatório!"
            valido = false
        }

        if(editSenha.text.isEmpty()){
            editSenha.error = "Senha é obrigatória!"
            valido = false
        }

        if(editProfissao.text.isEmpty()){
            editProfissao.error = "Profissão é obrigatória!"
            valido = false
        }

        if(editAltura.text.isEmpty()){
            editAltura.error = "Altura é obrigatória!"
            valido = false
        }

        if(editDataNascimento.text.isEmpty()){
            editDataNascimento.error = "Data de Nascimento é obrigatória!"
            valido = false
        }

        return valido

    }
}