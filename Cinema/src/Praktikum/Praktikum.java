package Praktikum;

import java.util.Scanner;

public class Praktikum {
    public static void main(String[] args) {
        ExpensesManager expensesManager = new ExpensesManager();
        Scanner scanner = new Scanner(System.in);
        System.out.println();
        System.out.println("Сколько денег у вас осталось до зарплаты?");
        System.out.println("Сколько денег у вас осталось после зарплаты?");
        System.out.println("Сколько денег у вас осталось после второй  зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
        int day = scanner.nextInt();
        System.out.println("Введите размер траты:");
        double expense = scanner.nextDouble();
        moneyBeforeSalary = expensesManager.saveExpense(moneyBeforeSalary, expense, day);
    }
}
