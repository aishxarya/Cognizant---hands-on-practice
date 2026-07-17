package com.cognizant.junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AAATest {

    private int number;

    @Before
    public void setUp() {
        System.out.println("Setting up...");
        number = 5;
    }

    @Test
    public void testAddition() {

        // Arrange
        int a = number;
        int b = 10;

        // Act
        int result = a + b;

        // Assert
        assertEquals(15, result);
    }

    @After
    public void tearDown() {
        System.out.println("Cleaning up...");
    }
}