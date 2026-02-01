
import java.util.Scanner;

public class Task81407 {
    // ℎ, 𝑚, 𝑠
    // 0 ≤ℎ <24,
    // 0 ≤𝑚,𝑠 <60.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[3];
        // Use a loop to read four integers
        for (int i = 0; i < 3; i++) {
            // The nextInt() method reads the next integer from the input stream
            numbers[i] = scanner.nextInt();
        }

        int h = numbers[0];
        int m = numbers[1];
        int s = numbers[2];

        if (s == 59) {
            s = 0;
            if (m == 59) {
                m = 0;
                if (h == 23) {
                    h = 0;
                } else {
                    h += 1;
                }
            } else {
                m += 1;
            }
        } else {
            s += 1;
        }

        System.out.println(h + " " + m + " " + s);

    }
}
