package Es2;

import java.util.Scanner;

public class Es2 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inserisci un intero!");
        int n1= scanner.nextInt();
        switch (n1){
            case 0:
                System.out.println("zero");
                break;
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("due");
                break;
            case 3:
                System.out.println("tre");
                break;
            default:
                System.out.println("Non è compreso tra 0 e 3");
        }
    }
}
