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
        int number = scanner.nextInt();
        int sum;

        for (number = 0; number >=0; number++){
            System.out.println(number+number);
        }

    }
}
