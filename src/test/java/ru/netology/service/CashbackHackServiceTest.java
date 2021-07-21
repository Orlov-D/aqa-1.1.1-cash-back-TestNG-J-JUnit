package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void underThousand() {
        assertEquals(cashbackHackService.remain(113), 887);
    }

    @Test
    public void aboveThousand() {
        assertEquals(cashbackHackService.remain(5800), 200);
    }

    @Test
    public void shouldBeZero() {
        assertEquals(cashbackHackService.remain(1000), 0);
    }

}