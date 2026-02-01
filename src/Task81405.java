import java.util.Scanner;

public class Task81405 {

    public static void main(String[] args) {
        //Вводиться три числа: 𝑛 метрів та 𝑚 сантиметрів — довжина крока, 𝑘 — кількість кроків.
        //
        //Вихідні дані
        //Виведіть, яку відстань у метрах та сантиметрах пройде Андрій.
        //
        //Обмеження
        //0 ≤𝑛,𝑘 ≤1000,
        //
        //0 ≤𝑚 ≤99.


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int k = scanner.nextInt();


        var n2 = n*k;
        var m2 = m * k;
        if (m2/100 > 0) {
            n2 = n2+m2/100;
        }
        System.out.println(Integer.toString(n2));
        System.out.println(Integer.toString(m2%100));
    }
}
