package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    // Hàm tính tổng các số từ 1 đến n
    public int calculateSum(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Giá trị n không hợp lệ. n phải là số nguyên dương.");
        }

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    // Hàm main thực thi chương trình
    public static void main(String[] args) {
        Main calculator = new Main();

        int n = 10; // Tính tổng từ 1 đến 10
        try {
            int result = calculator.calculateSum(n);
            System.out.println("Tổng các số từ 1 đến " + n + " là: " + result);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}