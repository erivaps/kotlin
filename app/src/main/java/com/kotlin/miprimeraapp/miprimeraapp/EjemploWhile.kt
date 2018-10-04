package com.kotlin.miprimeraapp.miprimeraapp


fun main(args: Array<String>){
    print("ingrese número:")
    var num = readLine()!!.toInt()
    var fact = 1

    while (num >=1) {
        fact *=num--
    }

    println("Factorial = $fact")
}