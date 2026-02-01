import java.util.Scanner;

public class Task81406 {

    //0 ≤𝑎,𝑏,𝑐,𝑑 ≤1000.

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[4];
        // Use a loop to read four integers
        for (int i = 0; i < 4; i++) {
            // The nextInt() method reads the next integer from the input stream
            numbers[i] = scanner.nextInt();
        }

        // Close the scanner (recommended to prevent resource leaks)
        scanner.close();

        var bookW = numbers[0] * 1000 + numbers[1];
        var maxW = numbers[2] * 1000 + numbers[3];

        var result = maxW / bookW;
        var result2 = maxW % bookW;

        System.out.println(result);

        System.out.println(result2 / 1000 + " " +  result2 % 1000);

    }
}
