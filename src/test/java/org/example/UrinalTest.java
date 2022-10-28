package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrinalTest {

    @Test
    void isValid() {
        Urinal urinal = new Urinal();
        int[] test = new int[]{1,0,0,0,1};
        assertTrue(urinal.isValid(test));
    }
}