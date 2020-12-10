import java.util.Random;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Type the number for vector position %d: ", i);
            a[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i : a) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%d x %d = %d", i, j, i * j);
                System.out.println();
            }
            System.out.println();
        }
    }


}
