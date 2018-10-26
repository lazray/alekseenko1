package ru.dvfu;

import java.util.Scanner;

public class Main01 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Введите значение x: ");
           int x = in.nextInt();
           System.out.print ("Введите значение y: ");
           int y = in.nextInt();
           // Арифметическая операция по вычеслению суммы чисел
        int z = x + y;
        System.out.println("Сумма введеных чисел x + y = " + z);
    }
}
