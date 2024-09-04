//import stuff here
import java.util.Scanner;
//Your code here
public class Program7 {
    public static void main(String[]args){
        final double klevin_schruteBuck = 1.0 / 20.0;
        final double stanleyNickel_klevin = 1.0 / 12.0;
        final double stanleyNickel_schruteBuck = stanleyNickel_klevin * klevin_schruteBuck;
       
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter schrute-bucks: ");
        int schruteBucks = Scanner.nextInt();
        
        System.out.println("Enter klevins: ");
        int klevins = Scanner.nextInt();
        
        System.out.println("Enter stanley-nickels: ");
        int stanleyNickels = Scanner.nextInt();

        double decimalSchruteBucks = schruteBucks + (klevins * klevin_schruteBucks) + (stanleyNickels * stanleyNickel_schruteBuck);
       
        System.out.println("Decimal schrute-bucks = $%.2f%n", decimalSchruteBucks);

        scanner.close();
    }
}
       

//Paste console output below:
/*


*/
