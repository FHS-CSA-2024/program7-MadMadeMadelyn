 
//import stuff here
import java.util.Scanner;
//Your code here
public class Program7{
    private double klevin_schruteBuck = 1.0 / 20.0;
    private double stanleyNickel_klevin = 1.0 / 12.0;
    private double stanleyNickel_schruteBuck = stanleyNickel_klevin * klevin_schruteBuck;
    public static void main(String[] args){
        Program7 tester = new Program7();

	double myTestVal = 0.0;

	Scanner Scanner = new Scanner(System.in);
	System.out.println("Enter schrute-bucks: ");
	int schruteBucks = Scanner.nextInt();
	
	System.out.println("Enter klevins: ");
	int klevins = Scanner.nextInt();
	        
	System.out.println("Enter stanley-nickels: ");
	int stanleyNickels = Scanner.nextInt();

        myTestVal = tester.convertMoney(schruteBucks,stanleyNickels,klevins);
        System.out.printf("Decimal schrute-bucks = $%.2f%n", myTestVal);
        Scanner.close();
    }
    public double convertMoney(int schruteBucks, int stanleyNickels, int klevins){
        double decimalSchruteBucks = schruteBucks + (klevins * klevin_schruteBuck) + stanleyNickels * stanleyNickel_schruteBuck;
        return decimalSchruteBucks;
    }
}
