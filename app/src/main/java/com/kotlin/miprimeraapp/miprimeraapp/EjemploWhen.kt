package com.kotlin.miprimeraapp.miprimeraapp

fun main(args: Array<String>){
    print("ingrese nota:")
    var edad = readLine()!!.toInt()

    when (edad) {
        in 0..10 -> print("Jalado")
        in 11..14 -> print("regular")
        in 15..17 -> print("Bueno")
        in 18..19 -> print("Excelente")
        20 -> print("Sobresaliente")
        else -> print("Fuera de rango")
    }
}


