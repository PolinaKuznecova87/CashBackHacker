package ru.netology.service;

import org.junit.*;

import static org.junit.Assert.*;




public class CashbackHackServiceTest {




    @Test
    public void remain() {

            int amount = 250;
            int expected = 750;
            CashbackHackService service = new CashbackHackService();
            int actual = service.remain(amount);
            assertEquals(expected,actual);

        }
        @Test
        public void testRemainMin() {
            int amount = 1000;
            int expected = 1000;
            CashbackHackService service = new CashbackHackService();
            int actual = service.remain(amount);
            assertEquals(expected,actual);

        }
    }


    
