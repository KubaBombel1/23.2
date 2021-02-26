
package zadanie.pkg6;

import java.util.Scanner;
public class Zadanie6 {

   
    public static void main(String[] args) 
    
    {
     
        System.out.println("Podaj 3 liczby a ja wypiszę je w kolejności malejacej");
        
        Scanner scan = new Scanner(System.in);
        double Liczba1 = scan.nextInt();
        
          double Liczba2 = scan.nextInt();
          
            double Liczba3 = scan.nextInt();
            
           System.out.println ("Po zmianie");
           
           if ((Liczba3 > Liczba1) && (Liczba3 > Liczba2) && (Liczba1 > Liczba2)) {
    System.out.println( Liczba3 );
     System.out.println( Liczba1 );
      System.out.println( Liczba2 );
           }
           else if ((Liczba2 > Liczba1) && (Liczba2 > Liczba3) && (Liczba1 > Liczba3)) {
    System.out.println( Liczba2 );
     System.out.println( Liczba1 );
      System.out.println( Liczba3 );
           }
      
              else if ((Liczba1 > Liczba2) && (Liczba1 > Liczba3) && (Liczba2 > Liczba3)) {
    System.out.println( Liczba1 );
     System.out.println( Liczba2 );
      System.out.println( Liczba3 );
           }
           
                 else if ((Liczba1 > Liczba2) && (Liczba1 > Liczba3) && (Liczba3 > Liczba2)) {
    System.out.println( Liczba1 );
     System.out.println( Liczba3 );
      System.out.println( Liczba2 );
           }
                 
                    else if ((Liczba3 > Liczba1) && (Liczba3 > Liczba2) && (Liczba2 > Liczba1)) {
    System.out.println( Liczba3 );
     System.out.println( Liczba2 );
      System.out.println( Liczba1 );
           }
                    
                   else if ((Liczba2 > Liczba1) && (Liczba2 > Liczba3) && (Liczba3 > Liczba1)) {
    System.out.println( Liczba2 );
     System.out.println( Liczba3);
      System.out.println( Liczba1 );
           }
           
 else {
    System.out.println("Jakas nieznana kombinacja za duzo jak na ten komputer");
}
            
        
    }
    
}
