package com.kotlin.miprimeraapp.miprimeraapp


 fun main(args: Array<String>) {
 print("ingrese número de 3  digitos:")
 var num = readLine().toString()


     var num2 = num
     var lista: MutableList<String> = mutableListOf(num)

     for (i in 1..3) {
         for (i in 1..3) {

             lista.add(num2)
         }
     }


 }