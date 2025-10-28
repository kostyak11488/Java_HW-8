package ru.netology.statistic;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class StatisticsServiceTest {
    @Test
    void findMax() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    void findEqual() {
        StatisticsService service = new StatisticsService();

        long[] incomesInBillions = {1, 10, 1, 1, 1, 1, 1, 1, 1, 1, 1};
        long expected = 10;

        long actual = service.findMax(incomesInBillions);

        Assertions.assertEquals(expected, actual);
    }

}
