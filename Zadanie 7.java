
package zadanie.pkg7.pkg2;

import java.util.Scanner;

   import static java.lang.Math.*;  
public class Zadanie72 {

    public static void main(String[]args) 
    
    {
        
        
    Scanner scanner = new Scanner(System.in);

 double Współrzędna_x1, Współrzędna_x2, Współrzędna_y1, Współrzędna_y2;
        
       System.out.println("Wpisz swoje współrzędne"); 
        
                Współrzędna_x1 = scanner.nextInt();
         
      Współrzędna_y1 = scanner.nextInt();
  
    Współrzędna_x2 = scanner.nextInt();
      
              Współrzędna_y2 = scanner.nextInt();

     System.out.println("Twój wynik " + sqrt((Math.pow(Współrzędna_x2-Współrzędna_x1, 2))+ (Math.pow(Współrzędna_y2-Współrzędna_y1, 2))));
        
        
    }
}
