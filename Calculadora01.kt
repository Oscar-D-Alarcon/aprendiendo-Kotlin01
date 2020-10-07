package com.example.aprendiendokotlin01

fun main (){
    var num1:Int
    var num2:Int
    var resultado:Int
    var opcion=0
    println("Calculadora")
    do {
        println("1.- Suma")
        println("2.- Resta")
        println("3.- Multiplicación")
        println("4.- División")
        println("5.- Salir")
        opcion= readLine()!!.toInt()
        when (opcion){
            1 -> {
                println("Suma")
                println("Primer valor:")
                num1= readLine()!!.toInt()
                println("Segundo valor:")
                num2= readLine()!!.toInt()
                println("El resultado es")
                println(suma( num1, num2))
                println("¿Qué desea hacer? 0)Continuar 5)Salir")
                opcion= readLine()!!.toInt()


            }
            2 -> {
                println("Resta")
                println("Primer valor:")
                num1= readLine()!!.toInt()
                println("Segundo valor:")
                num2= readLine()!!.toInt()
                println("El resultado es")
                println(resta( num1, num2))
                println("¿Qué desea hacer? 0)Continuar 5)Salir")
                opcion= readLine()!!.toInt()
            }
            3 -> {
                println("Multiplicación")
                println("Primer valor:")
                num1= readLine()!!.toInt()
                println("Segundo valor:")
                num2= readLine()!!.toInt()
                println("El resultado es")
                println(multi(num1, num2))
                println("¿Qué desea hacer? 0)Continuar 5)Salir")
                opcion= readLine()!!.toInt()
            }
            4 -> {
                println("División")
                println("Primer valor:")
                num1= readLine()!!.toInt()
                println("Segundo valor:")
                num2= readLine()!!.toInt()
                println("El resultado es")
                println(divi( num1, num2))
                println("¿Qué desea hacer? 0)Continuar 5)Salir")
                opcion= readLine()!!.toInt()
            }
        }
    }while (opcion!=5)

    println("Salió")

}

fun suma(a:Int, b:Int):Int{
    return a + b
}
fun resta(a:Int, b:Int):Int{
    return a - b
}
fun multi(a:Int, b:Int):Int{
    return a * b
}
fun divi(a:Int, b:Int): Int {
    return a / b
}