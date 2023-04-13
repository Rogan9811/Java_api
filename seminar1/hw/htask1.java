package seminar1.hw;

import java.util.Scanner;

public class htask1 {
    public static void tringleCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your number: ");
        String enter = scanner.next();
        int num = Integer.parseInt(enter);
        int sum = 0;
        for (int i = 1; i < num + 1; i++) {
            for (int j = 1; j < i + 1; j++) {
                sum += j;
            }
        }
        System.out.println(sum);
    }
}
