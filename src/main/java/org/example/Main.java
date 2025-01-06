package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Main calculator = new Main();

        int n = 10; // Tính tổng từ 1 đến n
        int result = calculator.calculateSum(n);

        System.out.println("Tổng các số từ 1 đến " + n + " là: " + result);
    }
}