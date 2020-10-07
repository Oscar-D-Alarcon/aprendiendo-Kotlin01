package com.example.aprendiendokotlin01

fun main (){
    var pin:Int
    var saldo=12956.87
    var opcion:Int
    var x:Double

    println("Cajero")
    do{
        println("Escribe tu PIN")
        pin= readLine()!!.toInt()
        if(pin!=2383){
            println("PIN incorrecto, Vuelva a intentarlo")
        }
    }while (pin!= 2383)
    println("Ingresó con éxito")
    do{
        println("Su saldo es:")
        println(saldo)
        println("¿Qué desea hacer?")
        println("1.- Retirar")
        println("2.- Depositar")
        println("3.- Salir")
        opcion= readLine()!!.toInt()

        when(opcion){
            1 -> {
                println("Retirar")
                print("Ingresa la cantidad a retirar")
                x= readLine()!!.toDouble()
                if (saldo<x){
                    print("Saldo insufuciente")
                }else{
                    println("se han retirado "+ x + ", su nuevo saldo es: "+ retirar(saldo, x))
                    saldo= retirar(saldo, x)
                }
            }
            2 -> {
                println("Depositar")
                print("Ingresa la cantidad a depositar")
                x= readLine()!!.toDouble()
                print("Su nuevo saldo es de: "+ depos(saldo, x))
                saldo= depos(saldo, x)
            }
        }

    }while (opcion!=3)
    println("Gracias, vuelva pronto")
}

fun retirar (a:Double, b:Double): Double {
    return a-b
}
fun depos (a:Double, b:Double): Double {
    return a+b
}