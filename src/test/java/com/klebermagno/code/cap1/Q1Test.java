package com.klebermagno.code.cap1;

import org.junit.Test;

import static org.junit.Assert.*;

public class Q1Test {

    @Test
    public void hasUnicChars_differentCharacteres_true() {
        boolean valuate = Q1.hasUnicChars("asdf");
        assertEquals(true,valuate);
    }
    @Test
    public void hasUnicChars_notUniqueCharacteres_false() {
        boolean valuate = Q1.hasUnicChars("asdfa");
        assertEquals(false,valuate);
    }

    @Test
    public void hasUnicCharsNoDataStructure_differentCharacteres_true() {
        boolean valuate = Q1.hasUnicCharsNoDataStructure("asdf");
        assertEquals(true,valuate);
    }
    @Test
    public void hasUnicCharsNoDataStructure_notUniqueCharacteres_false() {
        boolean valuate = Q1.hasUnicCharsNoDataStructure("asdfa");
        assertEquals(false,valuate);
    }
}