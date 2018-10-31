//Задача нахождения младших разрядов
package ru.dvfu.mrcpk.alekseenko.theme1;

import java.util.Scanner;

public class Main02 {
     // Поле класс
    public static void main(String[] args) {



         //Объявление переменных с инициализацией
         int x = 0, y = 0, z = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Введите значение целое натуральное число ");
        // Вводимое значение
        x = in.nextInt();

        //Вычисление десятков в числе
        y = x/10;

        //Вычисление младшего разряда
        z = x%10;


        // Приглашение ввести данных
        System.out.println("Десятков: " + y + ", младший разряд: " + z);
    }

}
