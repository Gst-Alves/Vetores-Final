import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Type the number for vector A position %d: ", i);
            a[i] = scanner.nextInt();
        }
        printVector("A", a);
        int[] b = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Type the number for vector B position %d: ", i);
            b[i] = scanner.nextInt();
        }
        printVector("B", a);

        int cLength = 0;
        for (int number : a) {
            if (contains(b, number)) {
                cLength++;
            }
        }

        int[] c = new int[cLength];
        int bIndex = 0;
        for (int number : a) {
            if (contains(b, number)) {
                c[bIndex++] = number;
            }
        }

        printVector("C", c);
    }

    private static boolean contains(int[] b, int number) {
        for (int numberFromA : b) {
            if (number == numberFromA) {
                return true;
            }
        }
        return false;
    }

    private static void printVector(String vectorName, int[] a) {
        System.out.printf("Numbers Vector %s: ", vectorName);
        for (int number : a) {
            System.out.printf(" %d ", number);
        }
        System.out.println();
    }
}
