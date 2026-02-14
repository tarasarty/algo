import java.util.Scanner;

public class Task_0006 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        long n = scanner.nextLong();
        long b = scanner.nextLong();
        long y = scanner.nextLong();

        if (n <= 1) {
            System.out.println(0);
            return;
        }

        long countB = (n - 1) / b;
        long countY = (n - 1) / y;

        long gcdVal = gcd(b, y);

        long lcm;
        try {
            long part = b / gcdVal;
            if (Long.MAX_VALUE / y < part) {
                lcm = n + 1;
            } else {
                lcm = part * y;
            }
        } catch (ArithmeticException e) {
            lcm = n + 1;
        }

        long countBoth = (n - 1) / lcm;

        long result = countB + countY - countBoth;
        System.out.println(result);
    }

    public static long gcd(long a, long b) {
        while (b > 0) {
            a %= b;
            long temp = a;
            a = b;
            b = temp;
        }
        return a;
    }
}