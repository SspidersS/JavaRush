
/*
Введи с клавиатуры целое число в диапазоне 1 - 999. Выведи его строку-описание следующего вида:

        «четное однозначное число» - если число четное и имеет одну цифру;
        «нечетное однозначное число» - если число нечетное и имеет одну цифру;
        «четное двузначное число» - если число четное и имеет две цифры;
        «нечетное двузначное число» - если число нечетное и имеет две цифры;
        «четное трехзначное число» - если число четное и имеет три цифры;
        «нечетное трехзначное число» - если число нечетное и имеет три цифры.
        Если введенное число не попадает в диапазон 1 - 999, не нужно ничего выводить на экран.
        Пример для числа 100:
        четное трехзначное число

 */

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class lev3 {
    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        int number = Integer.parseInt(reader.readLine());
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if (number > 0 && number < 10 && number % 2 == 0) {
            System.out.println("четное однозначное число");
        } else if (number > 0 && number < 10 && number % 2 != 0) {
            System.out.println("нечетное однозначное число");
        } else if (number > 9 && number < 100 && number % 2 == 0) {
            System.out.println("четное двузначное число");
        } else if (number > 9 && number < 100 && number % 2 != 0) {
            System.out.println("нечетное двузначное число");
        } else if (number > 99 && number < 1000 && number % 2 == 0) {
            System.out.println("четное трехзначное число");
        } else if (number > 99 && number < 1000 && number % 2 != 0) {
            System.out.println("нечетное трехзначное число");
        }
    }
}