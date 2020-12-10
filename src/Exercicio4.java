import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
        int[] a = new int[11];
        for (int i = 0; i < a.length; i++) {
            a[i] = (int) Math.pow(2, i);
        }

        System.out.print("Numbers Vector: ");
        for (int number : a) {
            System.out.printf(" %d ", number);
        }
    }
}
