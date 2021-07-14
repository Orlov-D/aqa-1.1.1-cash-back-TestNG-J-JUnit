package ru.netology.service;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.*;

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
    public void shouldFall() {
        assertEquals(cashbackHackService.remain(1000), 0);
    }

    @org.junit.jupiter.api.Test
    public void underThousand2(){
        Assertions.assertEquals(887,cashbackHackService.remain(113));
    }
}