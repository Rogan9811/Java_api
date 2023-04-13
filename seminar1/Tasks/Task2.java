package seminar1.Tasks;

public class Task2 {
    // 110011
    public static void run(int[] array) {
        int count = 0;
        int maxCount = 0;
        for (int item : array) {
            if (item == 1) {
                count++;
                if (count > maxCount) {
                    maxCount = count;
                }
            } else {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}
