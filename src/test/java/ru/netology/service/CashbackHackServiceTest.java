package ru.netology.service;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
public class CashbackHackServiceTest {
    CashbackHackService service = new CashbackHackService();

    @Test
    public void correctAmount() {

        int actual = service.remain(3_500);
        int expected = 500;

        assertEquals(actual, expected);
    }

    @Test
    public void emptyAmount() {

        int actual = service.remain(0);
        int expected = 1_000;

        assertEquals(actual, expected);
    }

    // данный тест падает, так как в сервисе есть ошибка
    @Test
    public void shouldNotSuggestRemain() {

        int actual = service.remain(1_000);
        int expected = 0;

        assertEquals(actual, expected);
    }
}