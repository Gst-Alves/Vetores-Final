import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Type the number for vector A position %d: ", i);
            a[i] = scanner.nextInt();
        }
        printVector("A", a);

        int[] b = new int[10];
        int smallestNumber = Integer.MIN_VALUE;
        int repetition = 0;
        for (int i = 0; i < b.length; i++) {
            if (repetition < 1) {
                smallestNumber = getSmallestNumberGreaterThan(smallestNumber, a);
                repetition = countRepetition(smallestNumber, a);
            }
            repetition--;
            b[i] = smallestNumber;
        }
        printVector("B", b);
    }

    private static int countRepetition(int number, int[] a) {
        int count = 0;
        for (int numberFromA : a) {
            if (number == numberFromA) {
                count++;
            }
        }
        return count;
    }

    private static int getSmallestNumberGreaterThan(int greaterThan, int[] a) {
        int smallestNumber = Integer.MAX_VALUE;
        for (int number : a) {
            if (number < smallestNumber && number > greaterThan) {
                smallestNumber = number;
            }
        }
        return smallestNumber;
    }

    private static void printVector(String vectorName, int[] a) {
        System.out.printf("Numbers Vector %s: ", vectorName);
        for (int number : a) {
            System.out.printf(" %d ", number);
        }
        System.out.println();
    }
}
