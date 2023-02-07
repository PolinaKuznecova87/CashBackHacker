package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {
       int amount = 250;
       int expected = 750;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected,actual);

    }
    @Test
    public void testRemainMin() {
        int amount = 3000;
        int expected = 1000;
        CashbackHackService service = new CashbackHackService();
        int actual = service.remain(amount);
        assertEquals(expected,actual);

    }
}