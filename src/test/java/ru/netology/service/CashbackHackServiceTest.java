package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void underThousand() {
        assertEquals(887, cashbackHackService.remain(113));
    }

    @Test
    public void aboveThousand() {
        assertEquals(200, cashbackHackService.remain(5800));
    }

    @Test
    public void shouldFall() {
        assertEquals(0, cashbackHackService.remain(1000));
    }
}