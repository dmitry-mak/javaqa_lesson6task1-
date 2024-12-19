package ru.netology.services;

public class VacationCalculation {

    public int calculate(int income, int expenses, int threshold) {

        int startingBalance = 0;
        int count = 0;
        for (int month = 1; month <= 12; month++) {
            int currentBalance;
            if (startingBalance >= threshold) {
                currentBalance = startingBalance - expenses;
                int additionalExpenses = currentBalance - currentBalance / 3;
                currentBalance = currentBalance - additionalExpenses;
//                String result = String.format("Месяц %d. Денег %d. Буду отдыхать. Потратил -%d, затем ещё -%d", month, startingBalance, expenses, additionalExpenses);
//                System.out.println(result);
                count++;
            } else {
                currentBalance = startingBalance + income - expenses;
//                String result = String.format("Месяц %d. Денег %d. Придётся работать. Заработал +%d, потратил -%d", month, startingBalance, income, expenses);
//                System.out.println(result);
            }
            startingBalance = currentBalance;
        }

        return count;
    }
}
