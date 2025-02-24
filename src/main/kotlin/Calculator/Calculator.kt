package org.example.Calculator

class Calculator {
    fun add(a: Double, b: Double): Double {//Estructura de una función, fun nombre (variables): tipo {}
                                          //Variables se escriben de la siguiente forma: nombre: tipo
        return a + b
    }

    fun substract(a: Double, b: Double): Double {
        return a - b
    }

    fun multiply(a: Double, b: Double): Double {
        return a * b
    }

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw ArithmeticException("No se puede dividir por cero")
        }
        return a / b
    }




}