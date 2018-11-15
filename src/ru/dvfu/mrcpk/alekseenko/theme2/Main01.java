package ru.dvfu.mrcpk.alekseenko.theme2;
import java.util.Scanner;
public class Main01 {
    public static void main(String[] args) {

        // Ввести с клавиатуры два 3-значных числа и поменять у них средние цифры (например, ввести 357  и 702 – получить и вывести числа  307 и 752)

        Scanner in = new Scanner(System.in);

        System.out.println("Введите с клавиатуры первое 3-значное число");
        int a = in.nextInt();  // Переменная, в которую сохраняется первое введенное значение.
        System.out.println("Введите с клавиатуры второе 3-значное число число");
        int b = in.nextInt();  // Переменная, в которую сохраняется первое введенное значение.
        int a1, a2, a3, b1, b2, b3;
        a1 = a / 100 % 100;
        a2 = a / 10 % 10;
        a3 = a % 10;
        b1 = b / 100 % 100;
        b2 = b / 10 % 10;
        b3 = b % 10;
        int aa = a1 * 100 + b2 * 10 + a3;
        int bb = b1 * 100 + a2 * 10 + b3;
        System.out.println("Меняем в веденных числах средние цифры:");
        System.out.println("Первое 3-значное число выглядит как: " + aa);
        System.out.println("Второе 3-значное число выглядит как: " + bb);
    }
}