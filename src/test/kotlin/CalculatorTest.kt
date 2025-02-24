import org.example.Calculator
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Assertions.assertThrows
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class CalculatorTest {
    private lateinit var calculator: Calculator// late init significa que más tarde se inicialida y es private para que solo se pueda acceder desde acá

    @BeforeEach// ejecutarse antes de cada prueba
    fun setUp() {
        calculator = Calculator()
    }

    //---------------------------------------- ADD TEST ---------------------------------------------

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

    @Test
    fun addWithNumberZeroTest(){
        val num1 = 5.0
        val num2 = 0.0

        val result = calculator.add(num1, num2)
        assertEquals(5.0, result, "La suma de 5.0 y 3.0 debería ser 8.0")
    }

    //----------------------------------------- SUBTRACT TEST ----------------------------------------------
    @Test
    fun subtractTest(){
        val num1 = 10.0
        val num2 = 4.0

        val result = calculator.subtract(num1, num2)
        assertEquals(6.0, result, "La resta de 5.0 y 3.0 debería ser 2.0")
    }

    @Test
    fun subtractWithTwoNegativeNumberTest(){
        val num1 = -10.0
        val num2 = -4.0

        val result = calculator.subtract(num1, num2)
        assertEquals(-6.0, result, "La resta de 5.0 y 3.0 debería ser 2.0")
    }

    @Test
    fun subtractWithNumberZeroTest(){
        val num1 = -10.0
        val num2 = 0.0

        val result = calculator.subtract(num1, num2)
        assertEquals(-10.0, result, "La resta de 5.0 y 3.0 debería ser 2.0")
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

    @Test
    fun multiplyNumberZeroTest(){
        val num1 = 2.0
        val num2 = 0.0

        val result = calculator.multiply(num1, num2)
        assertEquals(0.0, result, "La multiplicación de 5.0 y 3.0 debería ser 15.0")
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

    @Test
    fun divideByZeroTest() {
        val num1 = 10.0
        val num2 = 0.0

        val exception = assertThrows<ArithmeticException> {
            calculator.divide(num1, num2)
        }

        assertEquals("No se puede dividir por cero", exception.message)
    }


}