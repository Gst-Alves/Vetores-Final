import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.print("Type the number: ");
        int number = scanner.nextInt();
        String numberText = String.valueOf(number);
        System.out.printf("The number %d is%s palindrome", number, (isPalindrome(numberText)) ? "" : " not");
    }

    private static boolean isPalindrome(String number) {
        int left = 0;
        int right = number.length() - 1;
        while (left < right) {
            if (number.charAt(left++) != number.charAt(right--)) {
                return false;
            }
        }

        return true;
    }
}
