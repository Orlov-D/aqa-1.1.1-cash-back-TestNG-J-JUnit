package ru.netology.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    private CashbackHackService cashbackHackService = new CashbackHackService();

    @Test
    public void underThousand() {
        Assertions.assertEquals(887, cashbackHackService.remain(113));
    }

    @Test
    public void aboveThousand() {
        Assertions.assertEquals(200, cashbackHackService.remain(5800));
    }

    @Test
    public void shouldFall() {
        assertEquals(0, cashbackHackService.remain(1000));
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