package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void shouldReturn0IfAmountOn1000() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);



    }

    @Test
    public void shouldReturn1IfAmountOn999() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(actual, expected);



    }

    @Test
    public void shouldReturn999IfAmountOn1001() {
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);



    }

    @Test
    public void shouldReturn0IfAmountOn2000() {
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(actual, expected);



    }

    @Test
    public void shouldReturn999IfAmountOn1() {
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(actual, expected);



    }




}