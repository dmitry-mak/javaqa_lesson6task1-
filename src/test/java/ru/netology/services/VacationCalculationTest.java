package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import static org.junit.jupiter.api.Assertions.*;

class VacationCalculationTest {

    @Test
    void calculate1() {
        int income = 10000;
        int expenses = 3000;
        int threshold = 20000;
        int expected = 3;

        VacationCalculation calculation = new VacationCalculation();
        Assertions.assertEquals(expected, calculation.calculate(income, expenses, threshold));
    }

    @Test
    void calculate2() {
        int income = 100000;
        int expenses = 60000;
        int threshold = 150000;
        int expected = 2;

        VacationCalculation calculation = new VacationCalculation();
        Assertions.assertEquals(expected, calculation.calculate(income, expenses, threshold));
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/test-data.csv", numLinesToSkip = 1)
    void calculateParameterized1(int income, int expenses, int threshold, int expected) {
        VacationCalculation calculation = new VacationCalculation();
        assertEquals(expected, calculation.calculate(income, expenses, threshold));

    }
}