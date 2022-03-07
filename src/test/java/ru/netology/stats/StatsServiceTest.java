package ru.netology.stats;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StatsServiceTest {

    @Test
    void shouldcalculateSum() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 180;

        long actual = service.calculateSum(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 15;

        long actual = service.calculateAvg(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateNamberMaxSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 8;

        long actual = service.namberMaxMonthSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateNamberMinSales() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 9;

        long actual = service.namberMinMonthSales(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateCountMonthSalesLessAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.countMonthSalesLessAvg(sales);

        assertEquals(expected, actual);

    }

    @Test
    void shouldcalculateCountMonthSalesOverAvg() {
        StatsService service = new StatsService();
        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};
        long expected = 5;

        long actual = service.countMonthSalesOverAvg(sales);

        assertEquals(expected, actual);

    }
}