import java.util.Scanner;

public class TaskR {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int remainder = k % n;

        System.out.println((n - remainder) % n);
    }
}