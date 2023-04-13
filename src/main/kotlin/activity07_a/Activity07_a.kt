package activity07_a

import activity06_a.checkGrade
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*



class CheckGradeUnderTest {

    @Test
    fun testCalculateAverageGrade() {
        val grades = arrayOf(85, 90, 92, 88, 79, 91, 83, 87, 90, 94)
        assertEquals("3.0", checkGrade(grades))
    }

    @Test
    fun testInvalidSize() {
        val grades = arrayOf(85, 90, 92, 88, 79, 91, 83, 87, 90, 94, 95)
        assertThrows(IllegalArgumentException::class.java) { checkGrade(grades) }
    }

    @Test
    fun testEmpty() {
        val grades = arrayOf<Int>()
        assertThrows(IllegalArgumentException::class.java) { checkGrade(grades) }
    }

    @Test
    fun testInvalidGradeValue() {
        val grades = arrayOf(111, 90, 92, 88, 79, 110, 83, 87, 90, 94)
        assertThrows(IllegalArgumentException::class.java) { checkGrade(grades) }
    }

}