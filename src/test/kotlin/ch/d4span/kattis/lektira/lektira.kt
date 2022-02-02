package ch.d4span.kattis.lektira

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class LektiraTest {
    @Test
    fun testLektira() {
        assertEquals("aaaa", findSmallestString("aaaa"))

        assertEquals("abcdefghijk", findSmallestString("dcbagfekjih"))
        assertEquals("bometil", findSmallestString("mobitel"))
        assertEquals("aanadnok", findSmallestString("anakonda"))
    }
}