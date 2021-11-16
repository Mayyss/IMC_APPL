package com.example.imcappli.utils

import android.util.Log
import java.time.LocalDate
import java.time.Period

fun calcularIdade(dataNascimento: String) : Int {

    // Obter a data atual
    // now - agora
    val hoje = LocalDate.now()
    // Testando se o hoje está vindo certo
    //Log.i("xpto", hoje.toString())

    // Manipular data
    // Está extraindo separadamente pelo hifen
    val data = dataNascimento.split("-")
    Log.i("xpto", data.toString())
    Log.i("xpto", data.get(0))
    Log.i("xpto", data.get(1))
    Log.i("xpto", data.get(2))

    val nascimento = LocalDate.of(
                                    data.get(2).toInt(),
                                    data.get(1).toInt(),
                                    data.get(0).toInt())
    //var x = "10".toInt()
    //var Z = 50
    //var y = Z.toString()

    //Calcular o intervalo entre a data atual(hoje)
    // e a data de nascimento

    val idade = Period.between(nascimento,hoje).years

    Log.i("xpto", idade.toString())

    return 0
}