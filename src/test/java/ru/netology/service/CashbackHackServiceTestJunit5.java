package ru.netology.service;

import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

class CashbackHackServiceTestJunit5 {
    CashbackHackService service = new CashbackHackService();



    @Test
    public void shouldReturn0IfAmountOn1000J() {
        int amount = 1000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    public void shouldReturn1IfAmountOn999J() {
        int amount = 999;

        int actual = service.remain(amount);
        int expected = 1;

        assertEquals(expected, actual);


    }

    @Test
    public void shouldReturn999IfAmountOn1001J() {
        int amount = 1001;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);


    }

    @Test
    public void shouldReturn0IfAmountOn2000J() {
        int amount = 2000;

        int actual = service.remain(amount);
        int expected = 0;

        assertEquals(expected, actual);


    }

    @Test
    public void shouldReturn999IfAmountOn1J() {
        int amount = 1;

        int actual = service.remain(amount);
        int expected = 999;

        assertEquals(expected, actual);


    }

    @Test
    public void shouldReturn1000IfAmountOn0J() {
        int amount = 0;

        int actual = service.remain(amount);
        int expected = 1000;

        assertEquals(expected, actual);


    }

}