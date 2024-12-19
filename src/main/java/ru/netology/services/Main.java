package ru.netology.services;


public class Main {
    public static void main(String[] args) {

        VacationCalculation calculation = new VacationCalculation();
        System.out.println("отдохнуть получится " + calculation.calculate(10000, 3000, 20000) + " раза");

        System.out.println("Second version");
        calculation.calculate(100000, 60000, 150000);
        System.out.println("отдохнуть получится " + calculation.calculate(100000, 60000, 150000) + " раза");

    }
}