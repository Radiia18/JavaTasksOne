import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int totalMin = n * 45 + (n / 2) * 5 + ((n - 1) / 2) * 15;
        int hours = 9 + totalMin / 60;
        int minutes = totalMin % 60;
        System.out.println(hours + " " + minutes);
    }
}