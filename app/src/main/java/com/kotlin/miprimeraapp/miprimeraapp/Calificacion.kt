package com.kotlin.miprimeraapp.miprimeraapp

fun main(args: Array<String>){
    print("Nota:")
    var nota = readLine()

    if (nota!!.toInt()>0 && nota!!.toInt()<=10) {
        println("Jalado")
    } else if (nota!!.toInt()<14 ) {
        println("regular")
    } else if (nota!!.toInt()<17 ) {
        println("Bueno")
    } else if (nota!!.toInt()<19 ) {
        println("Excelente")
    } else if (nota!!.toInt()<20 ) {
        println("Sobresaliente")
    }


}