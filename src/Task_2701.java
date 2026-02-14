import java.util.Scanner;

public class Task_2701 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        long result = (long) b * c + a;
        System.out.println( result);
        scanner.close();
    }
}
