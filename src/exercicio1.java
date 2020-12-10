import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exercicio1 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Type the number for vector position %d: ", i);
            a[i] = scanner.nextInt();
        }
        printVector("A", a);

        int[] b = new int[20];
        int indexEven = 0;
        int indexOdd = 19;
        for (int number : a) {
            if(number % 2 == 0) {
                b[indexEven++] = number;
            } else {
                b[indexOdd--] = number;
            }
        }
        printVector("B", b);
    }

    private static void printVector(String vectorName, int[] a) {
        System.out.printf("Numbers Vector %s: ", vectorName);
        for (int number : a) {
            System.out.printf(" %d ", number);
        }
        System.out.println();
    }
}
