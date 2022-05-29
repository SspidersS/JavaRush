//Введи с клавиатуры число. Если число положительное, увеличь его в два раза. Если число отрицательное, прибавь единицу.
// Если введенное число равно нулю, выведи число ноль.
// Выведи результат на экран.

// 1 способ
//import java.util.Scanner;
//
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        int i = scanner.nextInt();
//
//        if ( i > 0){
//            System.out.println(i*2);;
//        }
//        if (i < 0){
//            System.out.println( i +1);
//        }
//        if (i == 0){
//            System.out.println("0");
//        }
//    }
//}

import java.io.BufferedReader;
import java.io.InputStreamReader;

class solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(reader.readLine());

        if (number > 0) {
            number = number * 2;
        } else if (number < 0) {
            number = number + 1;
        }
        System.out.println(number);
    }
}