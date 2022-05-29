
//Введи с клавиатуры два целых числа и выведи на экран минимальное из них.
//        Если два числа равны между собой, необходимо вывести любое.


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Level3Lec9 {
    public static void main(String[] args) throws Exception {
//        Scanner scanner = new Scanner(System.in);
//        int a = scanner.nextInt();
//        int b = scanner.nextInt();

//        if(a<b){
//            System.out.println(a);
//        }
//        if (a>b){
//            System.out.println(b);
//        }
//        if (a==b){
//            System.out.println(a);
//        }
//    }
//}

//        BufferedReader buff = new BufferedReader(new InputStreamReader (System.in));
//         int a = new buff.toString();
//         int b = new buff.readLine();
        //Error

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());

        int min;
        if (number1 < number2) {
            min = number1;
        } else {
            min = number2;
        }
        System.out.println(min);
    }
}



