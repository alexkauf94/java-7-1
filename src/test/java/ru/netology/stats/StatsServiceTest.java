package ru.netology.stats;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test

    public void testSum() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actial = service.sum(sales);

        long expected = 8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18;

        Assertions.assertEquals(expected, actial);
    }

    @Test

    public void testAverage() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actial = service.average(sales);

        long expected = (8 + 15 + 13 + 15 + 17 + 20 + 19 + 20 + 7 + 14 + 14 + 18) / 12;

        Assertions.assertEquals(expected, actial);
    }

    @Test

    public void testMonthMax() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actial = service.monthMaxSale(sales);

        long expected = 8;

        Assertions.assertEquals(expected, actial);
    }

    @Test

    public void testMonthMin() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actial = service.monthMinSale(sales);

        long expected = 9;

        Assertions.assertEquals(expected, actial);
    }

    @Test

    public void testMonthsBelowAverage() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actial = service.monthsBelowAverage(sales);

        long expected = 5;

        Assertions.assertEquals(expected, actial);
    }

    @Test

    public void testMonthsAboveAverage() {
        StatsService service = new StatsService();
        long [] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        long actial = service.monthsAboveAverage(sales);

        long expected = 5;

        Assertions.assertEquals(expected, actial);
    }
}