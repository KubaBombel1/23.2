
package zadanie.pkg4;

import java.util.Scanner;


public class Zadanie4 {

    
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) 
    {
     
        Scanner scan = new Scanner(System.in);

        System.out.println ("Podaj pierwszy bok");
        
        double Bok1 = scan.nextInt();
        
        System.out.println("Podaj drugi bok");
        
        double Bok2 = scan.nextInt();
        
        System.out.println ("Podaj trzeci bok");
        
        double Bok3 = scan.nextInt();
        
         if (Bok1 + Bok2 > Bok3) {
    System.out.println("Mozna zrobic trojkat");
} else {
    System.out.println("Nie mozna zrobic trojkat");
}
    }
    
}
