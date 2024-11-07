package com.klebermagno.code.advanced.enconding;

import static com.klebermagno.code.test.Test.assertEquals;;

public class Encoding {
    public String runLengthEncoding(String string) {
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < string.length()) {
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Encoding encoding = new Encoding();
        assertEquals("13A2B4C2D", encoding.runLengthEncoding("AAAAAAAAAAAAABBCCCCDD"));
    }
}
