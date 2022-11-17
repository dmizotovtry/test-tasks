import java.util.Scanner;

public class Name {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner scanner = new Scanner(System.in);
        String a = scanner.nextLine();
        if (a.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, Вячеслав");
        }
        else {
            System.out.println("Нет такого имени");
        }
    }
}