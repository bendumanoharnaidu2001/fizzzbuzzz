package org.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class MainTest {
    @Test
    public void fizzBuzz() {
        String result = Main.FizzBuzz(3);
        assertEquals( "Fizz", result);
    }
    @Test
    public void fizzBuzz2() {
        String result = Main.FizzBuzz(5);
        assertEquals( "Buzz", result);
    }
    @Test
    public void fizzBuzz3() {
        String result = Main.FizzBuzz(15);
        assertEquals( "FizzBuzz", result);
    }
    @Test
    public void fizzBuzz4() {
        String result = Main.FizzBuzz(2);
        assertEquals( "2", result);
    }
}