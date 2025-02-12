package ru.netology.service;


import org.junit.Assert;
import org.junit.Test;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void lessBoundary() {

        int actual = service.remain(900);
        int expected = 100;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void moreBoundary() {

        int actual = service.remain(1100);
        int expected = 900;

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void equallyBoundary() {
        int actual = service.remain(1000);
        int expected = 0;

        Assert.assertEquals(expected, actual);
    }
}