import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int minutes = 9 * 60 + n * 45
                + (n / 2) * 15
                + ((n - 1) / 2) * 5;

        System.out.println(minutes / 60 + " " + minutes % 60);
    }
}