package org.example

import org.example.Calculator.Calculator

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    val name = "Kotlin"
//    //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//    // to see how IntelliJ IDEA suggests fixing it.
//    println("Hello, " + name + "!")
//
//    for (i in 1..5) {
//        //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//        // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//        println("i = $i")
//    }


    val calculator = Calculator() // En kotlin no es necesario el new
    println("Suma 5.0 + 3.0:" + calculator.add(5.0, 4.0))// tampoco se necesita el ;
    println("Resta 10.0 - 4.0" + calculator.substract(10.0, 4.0))
    println("Multiplicacion 2.0 * 3.0" + calculator.multiply(2.0, 3.0))
    try {
        println("Division 10.0 / 2.0 = " + calculator.divide(10.0, 2.0))
    } catch (e: ArithmeticException) {
        println("Error en la división: ${e.message}")
    }

    try {
        println("Division 10.0 / 0.0 = " + calculator.divide(10.0, 0.0))
    } catch (e: ArithmeticException) {
        println("${e.message}")
    }

}