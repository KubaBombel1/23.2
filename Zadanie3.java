
package zadanie.pkg3;
import java.util.Scanner;

public class Zadanie3 {

   
    public static void main(String[] args) 
    {
        
        Scanner scan = new Scanner(System.in);

        double Stopnie = scan.nextInt();
        
       double wynik;
       
       wynik = (Stopnie * 1.8) + 32;
       
       System.out.println(wynik); 
        
    }
    
}
