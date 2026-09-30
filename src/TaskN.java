import java.util.Scanner;

public class TaskN {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = 9 * 60 + a * 45 + (a - 1) / 2 * 5 + a / 2 * 15;
        System.out.println(b/60 + " " + b%60);
    }
}