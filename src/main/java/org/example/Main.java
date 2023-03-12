package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String operation = scan.next();
        int x = scan.nextInt();
        int y = scan.nextInt();
        int result = Calculator.calculate(operation, x, y);
        System.out.println(result);
    }
}