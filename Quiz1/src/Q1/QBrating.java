package Q1;
import java.util.Scanner;
public class QBrating {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of passing attempts: ");
		double att = input.nextDouble();
		System.out.print("Enter the number of passing completions: ");
		double comp = input.nextDouble();
		System.out.print("Enter the number of passing yards: ");
		double yds = input.nextDouble();
		System.out.print("Enter the number of touchdown passes: ");
		double tds= input.nextDouble();
		System.out.print("Enter the number of interceptions: ");
		double ints = input.nextDouble();
	
	    if (att != 0) {
	    double a = ((double)comp  / att - 0.3) * 5.0;
	    double b = ((double)yds / att - 3.0) * 0.25;
	    double c = ((double)tds          / att) * 20.0;
	    double d = 2.375 - ((double)ints / att * 25.0);
	    double pR = ( (a+b+c+d) / 6.0 ) * 100.0;
	    if (pR < 0) 
	    	pR = 0;
	    else pR = pR;
	    System.out.print("The Passer Rating is ");
	    System.out.printf("%3.1f", pR);
	    }
	}
}