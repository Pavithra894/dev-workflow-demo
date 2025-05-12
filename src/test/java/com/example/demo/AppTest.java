package com.example.demo;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AppTest {

    @Test
    public void fastTest() {
        assertEquals(2, 1 + 1);
    }

    @Test
    @Tag("slow")
    public void slowTest() throws InterruptedException {
        Thread.sleep(1000); // Simulate slow test
        assertTrue(true);
    }
}
