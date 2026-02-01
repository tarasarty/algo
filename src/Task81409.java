import java.util.Scanner;


public class Task81409 {
    // ℎ, 𝑚, 𝑠
    // 0 ≤ℎ <24,
    // 0 ≤𝑚,𝑠 <60.
    private static final int maxMinutes = 1440;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minutes =  scanner.nextInt();


        int h = (minutes / 60) % 24;



        System.out.println(h  + " " +  minutes % 60);

    }
}
