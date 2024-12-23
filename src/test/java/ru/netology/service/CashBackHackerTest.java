package ru.netology.service;

import org.testng.Assert;
import org.testng.annotations.Test;



public class CashBackHackerTest {

    @Test
    public void shouldReturn100ifAmount900() {
        CashbackHackService service = new CashbackHackService();

        int amount = 900;
        int actual = service.remain(amount);
        int expected = 100;


        Assert.assertEquals(actual, expected);

    }

    @Test
    public void shouldReturn200ifAmount800() {
        CashbackHackService service = new CashbackHackService();

        int amount = 800;
        int actual = service.remain(amount);
        int expected = 200;


        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturn900ifAmount1100() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1100;
        int actual = service.remain(amount);
        int expected = 900;


        Assert.assertEquals(actual, expected);
    }
    @Test
    public void shouldReturn0ifAmount1000() {
        CashbackHackService service = new CashbackHackService();

        int amount = 1000;
        int actual = service.remain(amount);
        int expected = 0;


        Assert.assertEquals(actual, expected);
    }
}


