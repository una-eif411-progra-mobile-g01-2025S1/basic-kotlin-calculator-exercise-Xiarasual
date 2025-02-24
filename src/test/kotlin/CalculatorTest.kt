import org.example.Calculator
import org.junit.jupiter.api.Assertions.assertEquals

import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows
import kotlin.test.assertTrue

/**
 * CalculatorTest.kt
 *
 * Autor: Xiara Suárez Alpízar
 * Fecha de creación: 23 de febrero de 2025
 *
 * Descripción: Este archivo contiene las pruebas unitarias para la clase Calculator. Las pruebas cubren
 * varias funciones matemáticas como suma, resta, multiplicación y división. También se incluyen pruebas
 * para verificar el manejo de excepciones y los límites de los valores que se pueden manejar en cada operación.
 *
 */

// Clase que contiene las pruebas unitarias para la clase Calculator
class CalculatorTest {
    // Variable que almacena una instancia de la clase Calculator
    private lateinit var calculator: Calculator // late init significa que más tarde se inicializa y es private para que solo se pueda acceder desde acá

    // Método que se ejecuta antes de cada prueba para inicializar el objeto Calculator
    @BeforeEach // se ejecuta antes de cada prueba
    fun setUp() {
        calculator = Calculator() // Inicializa el objeto calculator antes de cada prueba
    }

    //---------------------------------------- ADD TEST ---------------------------------------------

    // Prueba para la función de suma
    @Test
    fun addTest() {
        // Arrange: Preparar los datos necesarios para la prueba
        val num1 = 5.0
        val num2 = 3.0

        // Act: Realizar la acción
        val result = calculator.add(num1, num2)

        // Assert: Verificar que el resultado es el esperado
        assertEquals(8.0, result, "La suma de 5.0 y 3.0 debería ser 8.0")
    }

    // Prueba de suma con un número negativo
    @Test
    fun addWithNegativeNumberTest() {
        val num1 = -5.0
        val num2 = 3.0

        val result = calculator.add(num1, num2)
        assertEquals(-2.0, result, "La suma de -5.0 y 3.0 debería ser -2.0")
    }

    // Prueba de suma con cero
    @Test
    fun addWithNumberZeroTest() {
        val num1 = 5.0
        val num2 = 0.0

        val result = calculator.add(num1, num2)
        assertEquals(5.0, result, "La suma de 5.0 y 0.0 debería ser 5.0")
    }

    // Prueba de suma con números grandes que resultan en una excepción
    @Test
    fun addWithLargeNumbersTest() {
        val num1 = Double.MAX_VALUE
        val num2 = Double.MAX_VALUE

        val exception = assertThrows<ArithmeticException> {
            calculator.add(num1, num2) // Se espera una excepción debido a un resultado demasiado grande
        }

        assertEquals("El resultado de la suma es demasiado grande para ser representado.", exception.message)
    }

    // Prueba de suma con números pequeños que resultan en una excepción
    @Test
    fun addWithSmallNumbersTest() {
        val num1 = -Double.MAX_VALUE
        val num2 = -Double.MAX_VALUE

        val exception = assertThrows<ArithmeticException> {
            calculator.add(num1, num2) // Se espera una excepción debido a un resultado demasiado pequeño
        }

        assertEquals("El resultado de la suma es demasiado pequeño para ser representado.", exception.message)
    }

    // Prueba para verificar que la suma devuelve un valor de tipo Double
    @Test
    fun addReturnsDoubleTest() {
        val result = calculator.add(10.0, 5.0)
        // Verifica que el resultado de la suma es un Double
        assertTrue(result is Double, "La suma debe devolver un Double")
    }

    //----------------------------------------- SUBTRACT TEST ----------------------------------------------

    // Prueba para la función de resta
    @Test
    fun subtractTest() {
        val num1 = 10.0
        val num2 = 4.0

        val result = calculator.subtract(num1, num2)
        assertEquals(6.0, result, "La resta de 10.0 y 4.0 debería ser 6.0")
    }

    // Prueba de resta con dos números negativos
    @Test
    fun subtractWithTwoNegativeNumberTest() {
        val num1 = -10.0
        val num2 = -4.0

        val result = calculator.subtract(num1, num2)
        assertEquals(-6.0, result, "La resta de -10.0 y -4.0 debería ser -6.0")
    }

    // Prueba de resta con cero
    @Test
    fun subtractWithNumberZeroTest() {
        val num1 = -10.0
        val num2 = 0.0

        val result = calculator.subtract(num1, num2)
        assertEquals(-10.0, result, "La resta de -10.0 y 0.0 debería ser -10.0")
    }

    // Prueba de resta con números grandes que resultan en una excepción
    @Test
    fun subtractWithLargeNumbersTest() {
        val num1 = Double.MAX_VALUE
        val num2 = -Double.MAX_VALUE

        val exception = assertThrows<ArithmeticException> {
            calculator.subtract(num1, num2) // Se espera una excepción debido a un resultado demasiado grande
        }

        assertEquals("El resultado de la resta es demasiado grande para ser representado.", exception.message)
    }

    // Prueba de resta con números pequeños que resultan en una excepción
    @Test
    fun subtractWithSmallNumbersTest() {
        val num1 = -Double.MAX_VALUE
        val num2 = Double.MAX_VALUE

        val exception = assertThrows<ArithmeticException> {
            calculator.subtract(num1, num2) // Se espera una excepción debido a un resultado demasiado pequeño
        }

        assertEquals("El resultado de la resta es demasiado pequeño para ser representado.", exception.message)
    }

    // Prueba para verificar que la resta devuelve un valor de tipo Double
    @Test
    fun subtractReturnsDoubleTest() {
        val result = calculator.subtract(10.0, 5.0)
        // Verifica que el resultado de la resta es un Double
        assertTrue(result is Double, "La resta debe devolver un Double")
    }

    //-------------------------------------- MULTIPLY TEST -------------------------------------------

    // Prueba para la función de multiplicación
    @Test
    fun multiplyTest() {
        val num1 = 2.0
        val num2 = 3.0

        val result = calculator.multiply(num1, num2)
        assertEquals(6.0, result, "La multiplicación de 2.0 y 3.0 debería ser 6.0")
    }

    // Prueba de multiplicación con un número negativo
    @Test
    fun multiplyNegativeNumberTest() {
        val num1 = 2.0
        val num2 = -3.0

        val result = calculator.multiply(num1, num2)
        assertEquals(-6.0, result, "La multiplicación de 2.0 y -3.0 debería ser -6.0")
    }

    // Prueba de multiplicación con cero
    @Test
    fun multiplyNumberZeroTest() {
        val num1 = 2.0
        val num2 = 0.0

        val result = calculator.multiply(num1, num2)
        assertEquals(0.0, result, "La multiplicación de 2.0 y 0.0 debería ser 0.0")
    }

    // Prueba de multiplicación con números grandes que resultan en una excepción
    @Test
    fun multiplyWithLargeNumbersTest() {
        val num1 = Double.MAX_VALUE
        val num2 = 2.0

        val exception = assertThrows<ArithmeticException> {
            calculator.multiply(num1, num2) // Se espera una excepción debido a un resultado demasiado grande
        }

        assertEquals("El resultado de la multiplicación es demasiado grande para ser representado.", exception.message)
    }

    // Prueba de multiplicación con números pequeños que resultan en una excepción
    @Test
    fun multiplyWithSmallNumbersTest() {
        val num1 = -Double.MAX_VALUE
        val num2 = Double.MAX_VALUE

        val exception = assertThrows<ArithmeticException> {
            calculator.multiply(num1, num2) // Se espera una excepción debido a un resultado demasiado pequeño
        }

        assertEquals("El resultado de la multiplicación es demasiado pequeño para ser representado.", exception.message)
    }

    // Prueba para verificar que la multiplicación devuelve un valor de tipo Double
    @Test
    fun multiplyReturnsDoubleTest() {
        val result = calculator.multiply(10.0, 5.0)
        // Verifica que el resultado de la multiplicación es un Double
        assertTrue(result is Double, "La multiplicación debe devolver un Double")
    }

    //--------------------------------- DIVIDE TEST --------------------------------------

    // Prueba para la función de división
    @Test
    fun divideTest() {
        val num1 = 10.0
        val num2 = 2.0

        val result = calculator.divide(num1, num2)
        assertEquals(5.0, result, "La división de 10.0 y 2.0 debería ser 5.0")
    }

    // Prueba de división con un número negativo
    @Test
    fun divideNegativeNumberTest() {
        val num1 = 10.0
        val num2 = -2.0

        val result = calculator.divide(num1, num2)
        assertEquals(-5.0, result, "La división de 10.0 y -2.0 debería ser -5.0")
    }

    // Prueba de división por cero (debe lanzar una excepción)
    @Test
    fun divideByZeroTest() {
        val num1 = 10.0
        val num2 = 0.0

        val exception = assertThrows<ArithmeticException> {
            calculator.divide(num1, num2) // Se espera una excepción por división por cero
        }

        assertEquals("No se puede dividir por cero", exception.message)
    }

    // Prueba de división con números grandes que resultan en una excepción
    @Test
    fun divideWithLargeNumbersTest() {
        val num1 = Double.MAX_VALUE
        val num2 = 0.0000000001 // Un número pequeño para probar la división

        val exception = assertThrows<ArithmeticException> {
            calculator.divide(num1, num2) // Se espera una excepción debido a un resultado demasiado grande
        }

        assertEquals("El resultado de la división es demasiado grande para ser representado.", exception.message)
    }

    // Prueba de división con números pequeños que resultan en una excepción
    @Test
    fun divideWithSmallNumbersTest() {
        val num1 = -Double.MAX_VALUE
        val num2 = 0.0000000000001 // Un número muy pequeño para probar la división

        val exception = assertThrows<ArithmeticException> {
            calculator.divide(num1, num2) // Se espera una excepción debido a un resultado demasiado pequeño
        }

        assertEquals("El resultado de la división es demasiado pequeño para ser representado.", exception.message)
    }

    // Prueba para verificar que la división devuelve un valor de tipo Double
    @Test
    fun divideReturnsDoubleTest() {
        val result = calculator.divide(10.0, 5.0)
        // Verifica que el resultado de la división es un Double
        assertTrue(result is Double, "La división debe devolver un Double")
    }



}
