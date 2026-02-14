import java.util.Scanner;

public class Task_2681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        if (!scanner.hasNextInt()) return;
        int m = scanner.nextInt();

        if (!scanner.hasNext()) return;
        String nStr = scanner.next();

        if (m == 2) {
            System.out.println("Yes");
            return;
        }

        long sumOfDigits = 0;
        int divisor = m - 1;

        for (int i = 0; i < nStr.length(); i++) {
            sumOfDigits += (nStr.charAt(i) - '0');
        }

        if (sumOfDigits % divisor == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        scanner.close();
    }
}