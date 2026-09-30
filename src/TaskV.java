import java.util.Scanner;

public class TaskV {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        int k = (a / b + 1000) / 1001;
        int max = a * k + b * (1 - k);
        System.out.println(max);
    }
}