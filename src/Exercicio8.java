import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            System.out.printf("Type the number for vector A position %d: ", i);
            a[i] = scanner.nextInt();
        }
        printVector("A", a);

        System.out.print("Type the number to find in vector A: ");
        int numberToFind = scanner.nextInt();

        System.out.printf("The number %d was %s", numberToFind, (contains(a, numberToFind)) ? "found" : "not found");
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
