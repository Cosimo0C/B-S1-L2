package Es1;

import java.util.Scanner;

public class Es1 {
    public static boolean stringaPariDispari(String s1){
        return s1.length()%2==0;
    }
    public static boolean annoBisestile(int n1){
        if (n1>=400) {
            if (n1 % 4 == 0 & n1 % 100 == 0) {
                if (n1 % 400 == 0) {
                    return true;
                } else {
                    return false;
                }
            } else if (n1 % 4 == 0) {
                return true;
            } else {
                return false;
            }
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Inseriscci una stringa!");
        String s1= scanner.nextLine();
        System.out.println("Se è true è pari il numero di caratteri della stringa, se è false è dispari. Quindi l'esito  è :" + stringaPariDispari(s1));
        System.out.println("Inseriscci un'anno!");
        int n1= scanner.nextInt();
        System.out.println("L'anno è bisestile? " + annoBisestile(n1));
    }
}
