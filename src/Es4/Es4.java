package Es4;

import java.util.Scanner;

public class Es4 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci un intero!");
        int n1= scanner.nextInt();
        for (int i = n1; i >= 0; i--) {
            System.out.println(i);
        }
    }
}
