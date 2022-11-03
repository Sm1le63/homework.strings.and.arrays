package ru.netology.stats.homework.strings.and.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatsServiceTest {

    @Test
    public void shouldCalculateAllSales() {        // Тест 1
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAll = 180;
        int actualAll = service.sumSales(sales);

        Assertions.assertEquals(expectedAll, actualAll);
    }

    @Test                                        // Тест 2
    public void shouldAveragePerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedAverage = 15;
        int actualAverage = service.averagePerMonth(sales);

        Assertions.assertEquals(actualAverage, expectedAverage);
    }

    @Test                                     // Тест 3
    public void shouldMaxSalesPerMonth() {
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMaxSales1 = 6;
        int expectedMaxSales2 = 8;
        int actualMaxSales = service.maxSalesPerMonth(sales);

        Assertions.assertEquals(expectedMaxSales1, expectedMaxSales2, actualMaxSales);
    }

    @Test
    public void shouldMinSalesPerMonth() {         // Тест 4
        StatsService service = new StatsService();

        long[] sales = {8, 15, 13, 15, 17, 20, 19, 20, 7, 14, 14, 18};

        int expectedMinSales = 9;
        int actualMinSales = service.minSales(sales);

        Assertions.assertEquals(expectedMinSales, actualMinSales);


    }


}
