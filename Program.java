import java.util.Scanner;

public class Program7 {
  public static void main(String args[]) {

        double klevin_schruteBuck = 1.0 / 20.0;
        double stanleyNickel_klevin = 1.0 / 12.0;
        double stanleyNickel_schruteBuck = stanleyNickel_klevin * klevin_schruteBuck;
       
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter schrute-bucks: ");
        int schruteBucks = Scanner.nextInt();
        
        System.out.println("Enter klevins: ");
        int klevins = Scanner.nextInt();
        
        System.out.println("Enter stanley-nickels: ");
        int stanleyNickels = Scanner.nextInt();

        double decimalSchruteBucks = schruteBucks + (klevins * klevin_schruteBuck) + (stanleyNickels * stanleyNickel_schruteBuck);
       
        System.out.printf("Decimal schrute-bucks = $%.2f%n", decimalSchruteBucks);

        Scanner.close();
  }
}
