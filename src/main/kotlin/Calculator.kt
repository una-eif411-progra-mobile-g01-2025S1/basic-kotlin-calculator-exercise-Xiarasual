package org.example

/**
 * Calculator.kt
 *
 * Autor: Xiara Suárez Alpízar
 * Proyecto: Basic Kotlin Calculator
 * Fecha de creación: 23 de febrero de 2025
 *
 * Descripción: Esta clase Calculator contiene métodos para realizar operaciones matemáticas básicas como
 * la suma, resta, multiplicación y división. Además, maneja casos en los que los resultados
 * son demasiado grandes o pequeños para ser representados, lanzando excepciones con mensajes apropiados.
 * Las funciones implementadas aseguran que el resultado de las operaciones no cause desbordamiento
 * o bajo desbordamiento, manejando estos casos de manera adecuada.
 */


// Clase Calculator que contiene funciones para operaciones matemáticas básicas
class Calculator {

    // Función para sumar dos números (a y b)
    fun add(a: Double, b: Double): Double {
        // Realiza la suma de a y b
        val result = a + b

        // Verifica si el resultado es infinito (positivo o negativo)
        if (result.isInfinite()) {
            // Si el resultado es infinito positivo, lanza una excepción con un mensaje adecuado
            if (result == Double.POSITIVE_INFINITY) {
                throw ArithmeticException("El resultado de la suma es demasiado grande para ser representado.")
            }
            // Si el resultado es infinito negativo, lanza una excepción con un mensaje adecuado
            else if (result == Double.NEGATIVE_INFINITY) {
                throw ArithmeticException("El resultado de la suma es demasiado pequeño para ser representado.")
            }
        }

        // Retorna el resultado de la suma si no es infinito
        return result
    }

    // Función para restar dos números (a y b)
    fun subtract(a: Double, b: Double): Double {
        // Realiza la resta de a y b
        val result = a - b

        // Verifica si el resultado es infinito (positivo o negativo)
        if (result.isInfinite()) {
            // Si el resultado es infinito positivo, lanza una excepción con un mensaje adecuado
            if (result == Double.POSITIVE_INFINITY) {
                throw ArithmeticException("El resultado de la resta es demasiado grande para ser representado.")
            }
            // Si el resultado es infinito negativo, lanza una excepción con un mensaje adecuado
            else if (result == Double.NEGATIVE_INFINITY) {
                throw ArithmeticException("El resultado de la resta es demasiado pequeño para ser representado.")
            }
        }

        // Retorna el resultado de la resta si no es infinito
        return result
    }

    // Función para multiplicar dos números (a y b)
    fun multiply(a: Double, b: Double): Double {
        // Realiza la multiplicación de a y b
        val result = a * b

        // Verifica si el resultado es infinito (positivo o negativo)
        if (result.isInfinite()) {
            // Si el resultado es infinito positivo, lanza una excepción con un mensaje adecuado
            if (result == Double.POSITIVE_INFINITY) {
                throw ArithmeticException("El resultado de la multiplicación es demasiado grande para ser representado.")
            }
            // Si el resultado es infinito negativo, lanza una excepción con un mensaje adecuado
            else if (result == Double.NEGATIVE_INFINITY) {
                throw ArithmeticException("El resultado de la multiplicación es demasiado pequeño para ser representado.")
            }
        }

        // Retorna el resultado de la multiplicación si no es infinito
        return result
    }

    // Función para dividir dos números (a y b)
    fun divide(a: Double, b: Double): Double {
        // Verifica si el divisor es cero, ya que la división por cero no está permitida
        if (b == 0.0) {
            throw ArithmeticException("No se puede dividir por cero")
        }

        // Realiza la división de a entre b
        val result = a / b

        // Verifica si el resultado es infinito (positivo o negativo)
        if (result.isInfinite()) {
            // Si el resultado es infinito positivo, lanza una excepción con un mensaje adecuado
            if (result == Double.POSITIVE_INFINITY) {
                throw ArithmeticException("El resultado de la división es demasiado grande para ser representado.")
            }
            // Si el resultado es infinito negativo, lanza una excepción con un mensaje adecuado
            else if (result == Double.NEGATIVE_INFINITY) {
                throw ArithmeticException("El resultado de la división es demasiado pequeño para ser representado.")
            }
        }

        // Retorna el resultado de la división si no es infinito
        return result
    }
}
