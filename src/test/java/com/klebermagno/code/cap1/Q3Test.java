package com.klebermagno.code.cap1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q3Test {

    @Test
    public void URLify() {
        String ret = Q3.URLify("Mr John Smith");
        assertEquals("Mr%20John%20Smith", ret);
    }
}