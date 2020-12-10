import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Type the number for vector position %d: ", i);
            a[i] = scanner.nextInt();
        }
        System.out.println();

        for (int i : a) {
            System.out.printf("Number: %d Is it a prime number: %s \n", i, isPrimeNumber(i));
        }
    }

    private static boolean isPrimeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }


}
