import java.util.Scanner;

public class Task_0181 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long b = scanner.nextInt();
        long result = (a * b ) % 2;
        System.out.println( result == 0 ? "Dragon" : "Imp");
        scanner.close();
    }
}
