import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = scanner.nextInt();
        int b = scanner.nextInt();

        int d = a - b;

        int sign = (d + 999) / 1999;

        System.out.println(a * sign + b * (1 - sign));
    }
}