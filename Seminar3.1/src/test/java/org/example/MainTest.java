package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import static org.example.Main.evenOddNumber;
import static org.example.Main.numberInInterval;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

class MainTest {
    @Test
    void even () {
        assertTrue(evenOddNumber(10));
    }

    @Test
    void odd () {
        assertFalse(evenOddNumber(11));
    }

    @Test
    void inInterval () {
        assertTrue(numberInInterval(50));
    }

    @Test
    void outInterval () {
        assertFalse(numberInInterval(1000));
    }
}