import org.example.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class CalculatorTest {
    private lateinit var calculator: Calculator// late init significa que más tarde se inicialida y es private para que solo se pueda acceder desde acá

    @BeforeEach// ejecutarse antes de cada prueba
    fun setUp() {
        calculator = Calculator()
    }

    //--------------------------------- ADD TEST --------------------------------------
    @Test
    fun addTest(){
        val num1 = 5.0
        val num2 = 3.0

        val result = calculator.add(num1, num2)
        assertEquals(8.0, result, "La suma de 5.0 y 3.0 debería ser 8.0")
    }

    @Test
    fun addWithNegativeNumberTest(){
        val num1 = -5.0
        val num2 = 3.0

        val result = calculator.add(num1, num2)
        assertEquals(-2.0, result, "La suma de 5.0 y 3.0 debería ser 8.0")
    }
    //--------------------------------- SUBSTRACT TEST --------------------------------------
    @Test
    fun substractTest(){
        val num1 = 10.0
        val num2 = 4.0

        val result = calculator.substract(num1, num2)
        assertEquals(6.0, result, "La resta de 5.0 y 3.0 debería ser 2.0")
    }

    @Test
    fun substractWithTwoNegativeNumberTest(){
        val num1 = -10.0
        val num2 = -4.0

        val result = calculator.substract(num1, num2)
        assertEquals(-6.0, result, "La resta de 5.0 y 3.0 debería ser 2.0")
    }

    //--------------------------------- MULTIPLY TEST --------------------------------------
    @Test
    fun multiplyTest(){
        val num1 = 2.0
        val num2 = 3.0

        val result = calculator.multiply(num1, num2)
        assertEquals(6.0, result, "La multiplicación de 5.0 y 3.0 debería ser 15.0")
    }

    @Test
    fun multiplyNegativeNumberTest(){
        val num1 = 2.0
        val num2 = -3.0

        val result = calculator.multiply(num1, num2)
        assertEquals(-6.0, result, "La multiplicación de 5.0 y 3.0 debería ser 15.0")
    }

    //--------------------------------- DIVIDE TEST --------------------------------------
    @Test
    fun divideTest(){
        val num1 = 10.0
        val num2 = 2.0

        val result = calculator.divide(num1, num2)
        assertEquals(5.0, result, "La división de 6.0 y 3.0 debería ser 2.0")
    }

    @Test
    fun divideNegativeNumberTest(){
        val num1 = 10.0
        val num2 = -2.0

        val result = calculator.divide(num1, num2)
        assertEquals(-5.0, result, "La división de 6.0 y 3.0 debería ser 2.0")
    }

//     Probar división por cero
//    @Test
//    fun divideByZeroTest(){
//        val num1 = 6.0
//        val num2 = 0.0
//
//        try {
//            calculator.divide(num1, num2)
//            fail("Se esperaba una excepción ArithmeticException")
//        } catch (e: ArithmeticException) {
//            assertEquals("No se puede dividir por cero", e.message)
//        }
//    }

}