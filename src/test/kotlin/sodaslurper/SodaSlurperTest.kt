package sodaslurper

import computeSodas

import kotlin.test.Test
import kotlin.test.assertEquals

class SodaSlurperTest {

    @Test
    fun testComputeSodas() {
        assertEquals(4, computeSodas(9, 0, 3))
        assertEquals(9, computeSodas(5, 5, 2))
    }
}