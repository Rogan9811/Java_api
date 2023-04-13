package seminar1.hw;

import java.util.Scanner;

public class htask2 {
    public static void factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String enter = scanner.next();
        int num = Integer.parseInt(enter);
        int mult = 1;
        for (int i = 1; i < num + 1; i++) {
            mult *= i;
        }
        System.out.println(mult);
    }
}
