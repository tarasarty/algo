import java.util.Scanner;

public class Task_1681 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }

        int n = scanner.nextInt();
        boolean result  = true;

        int[] data = new int[n];
        for (int i = 0; i < n; i++) {
            if (scanner.hasNextLong()) {
                data[i] = scanner.nextInt();
            }
        }

        for (int i = 1; i < n; i++) {
           int diff = data[i] - data[i-1];
            if (diff < 2) {
                result = false;
                break;
            }
        }
        System.out.println( result ? "YES" : "NO");
        scanner.close();
    }
}
