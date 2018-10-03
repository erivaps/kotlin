package com.kotlin.miprimeraapp.miprimeraapp

fun main(args: Array<String>){
    print("ingrese su edad:")
    var edad = readLine()
    //if (   edad.isNullOrBlank())
    if (edad!!.toInt()>20)
        println("Eres Joven aún")
}