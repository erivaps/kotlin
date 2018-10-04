package com.kotlin.miprimeraapp.miprimeraapp

fun main(args: Array<String>){
    print("ingrese número:")
    var num = readLine()!!.toInt()
    var fact = 1

    for (i in 1..num) {
        fact *=i
    }

    println("Factorial de $num = $fact")
}