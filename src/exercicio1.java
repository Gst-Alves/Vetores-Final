import java.util.Scanner;

public class Exercicio1 {
	
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
            int size = 20; 
            int a[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
            int b[] = new int[size + 1]; 
            int i; 
            
            System.out.print("Vetor A com 20 elementos: ");
            for (i = 0; i < size; i++) {
                System.out.print(a[i] + ",");
            }
            
            System.out.print("\nVetor B com elementos pares: ");
            for (i = 1; i <= size; i++) {
            	if (i % 2 == 0) {
            		b[i] = i;
                    System.out.print(b[i] + ",");
            	}
            }
            
            System.out.print("\nVetor B com elementos ímpares: ");
            for (i = 0; i < size; i++) {
            	if (i % 2 != 0) {
            		b[i] = i;
                    System.out.print(b[i] + ",");
            	}
            }


        in.close();
    }

}