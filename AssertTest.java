package com.teste;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AssertTest {
    @Test
    public void testAssertArrayEquals(){
        byte[] esperado = "teste".getBytes();
        byte[] atual    = "testedadfasdfasdf1".getBytes();
        assertArrayEquals(esperado,atual);
    }

    @Test
    public void testAssertEquals(){
        assertEquals("text", "text");
    }

    @Test
    public void testAssertNotNull(){
        assertNotNull(new Object());
    }

    @Test
    public void testAssertNotSame(){
        assertNotSame(new Object(), new Object());
    }
    @Test
    public void testAssertNull(){
        assertNull(null);
    }
    @Test
    public void testAssertSame(){
        Integer aNumber = Integer.valueOf(768);
        assertSame(aNumber, aNumber);
    }
}
