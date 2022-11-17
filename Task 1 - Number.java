import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        if (a > 7) {
            System.out.println("Привет");
        }
    }
}