
package zadanie.pkg5.pkg2;

import java.util.Scanner;
public class Zadanie52 {

    
    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);
        int Dzien = scan.nextInt();
        
        switch (Dzien) {
    case 1:
        System.out.println("Poniedzialek");
        break;
    case 2:
        System.out.println("Wtorek");
        break;
        
         case 3:
        System.out.println("Sroda");
        break;
    case 4:
        System.out.println("Czwartek");
        break;
        
         case 5:
        System.out.println("Piatek");
        break;
    case 6:
        System.out.println("Sobota");
        break;
        
         case 7:
        System.out.println("Niedzela");
        break;
   
        
    default:
        System.out.println("Nie istanieje taki dzien tygodnia");
}
        
        
        
        
        
        
    }
    
}
