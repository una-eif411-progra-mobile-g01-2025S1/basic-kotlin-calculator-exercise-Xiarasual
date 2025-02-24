package org.example

class Calculator {
    fun add(a: Double, b: Double): Double {//Estructura de una función, fun nombre (variables): tipo {}
                                          //Variables se escriben de la siguiente forma: nombre: tipo
        val result = a + b
        if (result.isInfinite()) {
            if (result == Double.POSITIVE_INFINITY) {
                throw ArithmeticException("El resultado de la suma es demasiado grande para ser representado.")
            } else if (result == Double.NEGATIVE_INFINITY) {
                throw ArithmeticException("El resultado de la suma es demasiado pequeño para ser representado.")
            }
        }
        return result
    }

    fun subtract(a: Double, b: Double): Double {
        val result = a - b
        if (result.isInfinite()) {
            if (result == Double.POSITIVE_INFINITY) {
                throw ArithmeticException("El resultado de la resta es demasiado grande para ser representado.")
            } else if (result == Double.NEGATIVE_INFINITY) {
                throw ArithmeticException("El resultado de la resta es demasiado pequeño para ser representado.")
            }
        }
        return result
    }

    fun multiply(a: Double, b: Double): Double {
        val result = a * b
        if (result.isInfinite()) {
            if (result == Double.POSITIVE_INFINITY) {
                throw ArithmeticException("El resultado de la multiplicación es demasiado grande para ser representado.")
            } else if (result == Double.NEGATIVE_INFINITY) {
                throw ArithmeticException("El resultado de la multiplicación es demasiado pequeño para ser representado.")
            }
        }
        return result
    }

    fun divide(a: Double, b: Double): Double {
        if (b == 0.0) {
            throw ArithmeticException("No se puede dividir por cero")
        }
        val result = a / b
        if (result.isInfinite()) {
            if (result == Double.POSITIVE_INFINITY) {
                throw ArithmeticException("El resultado de la división es demasiado grande para ser representado.")
            } else if (result == Double.NEGATIVE_INFINITY) {
                throw ArithmeticException("El resultado de la división es demasiado pequeño para ser representado.")
            }
        }
        return result
    }
}