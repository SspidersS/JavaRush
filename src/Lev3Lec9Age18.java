
import java.util.Scanner;

public class Lev3Lec9Age18 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();

//        BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
//         String name = buff.readLine();
//         int age = buff.read();

        if (age > 20) {
            System.out.println("И 18-ти достаточно");
        }
        if (age <= 20) {
        }
    }
}



