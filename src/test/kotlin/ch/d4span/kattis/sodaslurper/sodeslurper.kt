package ch.d4span.kattis.sodaslurper

import computeSodas
import kotlin.test.Ignore

import kotlin.test.Test
import kotlin.test.assertEquals

class SodeSlurperTest {

    @Test
    @Ignore
    fun testComputeSodas() {
        assertEquals(4, computeSodas(9, 0, 3))
        assertEquals(9, computeSodas(5, 5, 2))
    }
}