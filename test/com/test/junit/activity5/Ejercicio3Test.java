package com.test.junit.activity5;

import org.junit.Test;

import static org.junit.Assert.*;

public class Ejercicio3Test {

    @Test
    public void mask() {
        Ejercicio3 pass = new Ejercicio3();

        assertEquals("password too short", pass.mask("test"));
        assertEquals("********", pass.mask("testtest"));
        assertEquals("************", pass.mask("qwertyuiopasdfghjkl"));
        assertEquals("password too long", pass.mask("qwertyuiopasdfghjklzxcvbnm1234567890qwertyuiop"));
    }
}