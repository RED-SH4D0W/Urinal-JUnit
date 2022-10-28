package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class UrinalTest {

    @Test
    void test1() {
        System.out.println("====== Prasant Ganesan == TEST ONE EXECUTED =======");
        Urinal urinal = new Urinal();
        int[] test = new int[]{1,0,0,0,1};
        assertTrue(urinal.isValid(test));
    }
    @Test
    void test2() {
        System.out.println("====== Prasant Ganesan == TEST TWO EXECUTED =======");
        Urinal urinal = new Urinal();
        int[] test = new int[]{1,0,0,1};
        assertTrue(urinal.isValid(test));
    }
    @Test
    void test3() {
        System.out.println("====== Prasant Ganesan == TEST THREE EXECUTED =======");
        Urinal urinal = new Urinal();
        int[] test = new int[]{0,0,0,0,0};
        assertTrue(urinal.isValid(test));
    }
    @Test
    void test4() {
        System.out.println("====== Prasant Ganesan == TEST FOUR EXECUTED =======");
        Urinal urinal = new Urinal();
        int[] test = new int[]{0,0,0,0};
        assertTrue(urinal.isValid(test));
    }
    @Test
    void test5() {
        System.out.println("====== Prasant Ganesan == TEST FIVE EXECUTED =======");
        Urinal urinal = new Urinal();
        int[] test = new int[]{0,1,0,0,0};
        assertTrue(urinal.isValid(test));
    }
    @Test
    void test6() {
        System.out.println("====== Prasant Ganesan == TEST SIX EXECUTED =======");
        Urinal urinal = new Urinal();
        int[] test = new int[]{0,1,1};
        assertFalse(urinal.isValid(test));
    }
    @Test
    void test7() {
        System.out.println("====== Prasant Ganesan == TEST SEVEN EXECUTED =======");
        Urinal urinal = new Urinal();
        int[] test = new int[]{5,8,4};
        assertFalse(urinal.isValid(test));
    }
    @Test
    void test8() {
        System.out.println("====== Prasant Ganesan == TEST EIGHT EXECUTED =======");
        Urinal urinal = new Urinal();
        int[] test = new int[]{1,0,0,1,1,0,1,0,1,0,0,0,1,0,1,0,1,0,0,0,1,0,1,0,1};
        assertFalse(urinal.isValid(test));
    }
}