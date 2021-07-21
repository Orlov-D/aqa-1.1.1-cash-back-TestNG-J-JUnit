package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void underThousand() {
        Assertions.assertEquals(cashbackHackService.remain(113), 887);
    }

    @Test
    public void aboveThousand() {
        Assertions.assertEquals( 200,cashbackHackService.remain(5800));
    }

    @Test
    public void shouldFall() {
        assertEquals(cashbackHackService.remain(1000), 0);
    }

    @Test
    public void underThousand2() {
        assertEquals(887, cashbackHackService.remain(113));
    }

    @Test
    public void aboveThousand2() {
        assertEquals(200, cashbackHackService.remain(5800));
    }
}