import java.util.Scanner;

public class TaskT {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int a = n / 1000;
        int b = n / 100 % 10;
        int c = n / 10 % 10;
        int d = n % 10;

        int result = 1 - Math.abs(a - d) - Math.abs(b - c);

        System.out.println(result);
    }
}