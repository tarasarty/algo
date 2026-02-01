import java.util.Scanner;

public class Task81410 {
    // ℎ, 𝑚, 𝑠
    // 0 ≤ℎ <24,
    // 0 ≤𝑚,𝑠 <60.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers1 = new int[3];
        // Use a loop to read four integers
        for (int i = 0; i < 3; i++) {
            // The nextInt() method reads the next integer from the input stream
            numbers1[i] = scanner.nextInt();
        }

        int h1 = numbers1[0];
        int m1 = numbers1[1];
        int s1 = numbers1[2];

        int[] numbers2 = new int[3];
        // Use a loop to read four integers
        for (int i = 0; i < 3; i++) {
            // The nextInt() method reads the next integer from the input stream
            numbers2[i] = scanner.nextInt();
        }


        int h2 = numbers2[0];
        int m2 = numbers2[1];
        int s2 = numbers2[2];

        int seconds1 = s1 + m1*60 + h1*3600;
        int seconds2 = s2 + m2*60 + h2*3600;

       int result = seconds2 - seconds1;

        System.out.println(result);

    }
}
