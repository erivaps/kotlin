package com.kotlin.miprimeraapp.miprimeraapp


fun main(args: Array<String>){
    print("ingrese número del 1 al 10:")
    var num = readLine()!!.toInt()

    for (i in 1..10) {
        if (i==num){
            println("encontrado")
            break
        }
        println("aun no encontrado")

    }

}