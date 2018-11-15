package ru.dvfu.mrcpk.alekseenko.theme1;
//
import java.util.Scanner;
public class Main06 {
    public static void main(String args[]) {
        // Возведение  числа в степень
        Scanner in = new Scanner(System.in);

        System.out.println("Введите число");
        double x = in.nextInt();
        System.out.println("Введите степнь");
        double y = in.nextInt();

        System.out.printf("Число  в введеной степени  равно %.0f \n", Math.pow(x, y));
    }
}

