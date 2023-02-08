package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {

    @Test
    public void testRemain() {

        CashbackHackService service = new CashbackHackService();
        assertEquals(service.remain(250), 750);

    }

    @Test
    public void testRemainMin() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1000), 0);

    }

    @Test
    public void testRemainBelowThousand() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(999), 1);

    }

    @Test
    public void testRemainOne() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(1), 999);

    }

    @Test
    public void testRemainZiro() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(0), 1000);

    }

    @org.junit.jupiter.api.Test
    void remain() {
        CashbackHackService service = new CashbackHackService();

        assertEquals(service.remain(0), 1000);

    }
}

