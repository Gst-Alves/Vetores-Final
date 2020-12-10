import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] a = new int[15];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Type the number for vector position %d: ", i);
            a[i] = scanner.nextInt();
        }
        printVector("A", a);

        int[] b = new int[15];
        for (int i = 0; i < a.length; i++) {
            b[i] = factorial(a[i]);
        }
        printVector("B", b);
    }

    private static int factorial(int number) {
        int result = 1;
        for (int i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    private static void printVector(String vectorName, int[] a) {
        System.out.printf("Numbers Vector %s: ", vectorName);
        for (int number : a) {
            System.out.printf(" %d ", number);
        }
        System.out.println();
    }
}
