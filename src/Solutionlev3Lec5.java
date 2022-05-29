/*
Напиши код программы, которая будет правильно считать количество созданных котов (count)
и правильно выводить на экран их количество.
 */

public class Solutionlev3Lec5 {
    public static void main(String[] args) {
        Cat cat1 = new Cat();
        Cat.count ++ ;

        Cat cat2 = new Cat();
        Cat.count ++;

        System.out.println("The cat count is " + Cat.count);
    }

    public static class Cat {
        public static int count = 0;
    }
}
