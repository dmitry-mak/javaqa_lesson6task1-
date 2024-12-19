package ru.netology.services;

public class VacationCalculation {

    public int calculate(int income, int expenses, int threshold) {

        int currentBalance = 0;
        int count = 0;
        for (int month = 1; month <= 12; month++) {
            if (currentBalance >= threshold) {
                currentBalance -= expenses;
                currentBalance -= (currentBalance - currentBalance / 3);
                count++;
            } else {
                currentBalance = currentBalance + income - expenses;
            }
        }
        return count;
    }
}
