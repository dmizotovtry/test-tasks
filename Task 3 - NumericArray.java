import java.util.Scanner;
import java.util.Arrays;

public class NumericArray {
    public static void main(String[] args) {
        System.out.println("Введите числовой массив: ");
        Scanner input = new Scanner(System.in);
        int arr = input.nextInt();
            Arrays.stream(new int[]{arr})
                .filter(i -> (0 == (i % 3)))
                .forEach(System.out::println);
            }
        }
