/*
Введи с клавиатуры три целых числа. Выведи на экран количество положительных чисел среди этих трех.

Примеры:
а) при вводе чисел:
-4
6
6
получим вывод:
2

б) при вводе чисел:
-6
-6
-3
получим вывод:
0

в) при вводе чисел:
0
1
2
получим вывод:
2
 */

import java.util.Scanner;

public class lev3ex2 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();
        int number3 = scanner.nextInt();
        int counter = 0;
        if (number1 > 0) {
            counter++;
        }
        if (number2 > 0) {
            counter++;
        }
        if (number3 > 0) {
            counter++;
        }
        System.out.println(counter);
    }
}
