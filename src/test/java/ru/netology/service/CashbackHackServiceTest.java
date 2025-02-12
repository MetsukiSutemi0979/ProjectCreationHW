package ru.netology.service;

import org.testng.IExpectedExceptionsHolder;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class CashbackHackServiceTest {

    CashbackHackService service = new CashbackHackService();

    @Test
    public void lessBoundary() {

        int actual = service.remain(900);
        int expected = 100;

        assert (actual == expected);
    }

    @Test
    public void moreBoundary() {

        int actual = service.remain(1100);
        int expected = 900;

        assert (actual == expected);
    }

    @Test
    public void equallyBoundary() {
        int actual = service.remain(1000);
        int expected = 1000;

        assert (actual == expected);
    }
}