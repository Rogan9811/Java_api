package seminar1.hw;

import java.util.Scanner;

public class htask3 {
    public static void calcualtor() {
        boolean flag = true;
        while (flag == true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your 1st number - ");
            String enter = scanner.next();
            int fNum = Integer.parseInt(enter);
            System.out.println("Chose number's operation(1 - '+',2 - '-',3 -  '*',4 - '/'): ");
            enter = scanner.next();
            int operation = Integer.parseInt(enter);
            System.out.println("Enter your 2nd number - ");
            enter = scanner.next();
            int sNum = Integer.parseInt(enter);
            if (operation == 1) {
                System.out.println(fNum + sNum);
            } else if (operation == 2) {
                System.out.println(fNum - sNum);
            } else if (operation == 3) {
                System.out.println(fNum * sNum);
            } else if (operation == 4) {
                System.out.println(fNum / sNum);
            } else {
                System.out.println("Error. Try again.");
            }
            System.out.println("1 - continue work \n2 - stop.");
            enter = scanner.next();
            int cont = Integer.parseInt(enter);
            if (cont == 2) {
                flag = false;
            }
        }
    }
}