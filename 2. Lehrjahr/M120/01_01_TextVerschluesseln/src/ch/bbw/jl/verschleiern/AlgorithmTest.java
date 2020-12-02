package ch.bbw.jl.verschleiern;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AlgorithmTest {

    @Test
    public void testReverseString() {
        String value = "Bananarama";
        String reversed = "amarananaB";
        assertEquals(reversed, Algorithm.reverseString(value));
    }

    @Test
    public void testCapitalizeString() {
        String value = "Bananarama";
        String capitalized = "BANANARAMA";
        assertEquals(capitalized, Algorithm.capitalizeString(value));
    }

}
