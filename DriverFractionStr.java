package fraction;
import java.util.Scanner;

/** 
 * Class DriverFractionStr allows user to enter 2 fractions as  a string  
 * and it create two fractions object.
 * Then it creates pc object (PrintCalculation) and it calls method printCalculation
 * 
 * It tests class Function and constructor that accepts String.
 * 
 * @author David Sajdl
 * username dsajdl01
 * @version 10/01/2013
 */
public class DriverFractionStr {
	
	/**
	 * main allows user to to enter fraction as string
	 * and then send for process 
	 * 
	 * @param args
	 */
	public static void main (String[]args){
		  Scanner in = new Scanner(System.in);
		  System.out.println("\t\t\t\tFRACTION\n");
		  System.out.println("This programs calculate fraction. The maximum and minimum number of numerator "
		  				 + "\nand denominator are 99999999 or -99999999. This rule apply either when two"
		  				 + "\nnumbers are added or multiply the and result is graeter than 99999999 or"
		  				 + "\nsmaller than -99999999. it would appear a worning message and result would be zero."
		  				 + "\n\nWhen two fractions are input, they would be added, multiplied, "
		  				 + "\nsubtracted, divided, inversed, absolution and comparing "
		  				 + "\nif they are greater, smaller or equal.\n\n");
	        boolean cont = true;
	        while(cont){
	            System.out.print("Please enter two fractions as following format: 3/4 and 3 \nor n to finish program "
	            		+ "\n\nPlease first fraction: ");
	            String str = in.nextLine();
	            if(str.equals("n")){
	                cont = false;
	                System.out.println("\nGood bay ");
	                in.close();
	            }
	            else{
	            Fraction frc = new Fraction(str);
	            System.out.println();
	            System.out.print("Please enter second fraction: ");
	            String str1 = in.nextLine(); 
	            Fraction frc1 = new Fraction(str1);
	            
	            PrintCalculation pc = new PrintCalculation();
	            pc.printRresult(frc, frc1);
	            }
	        }
    }
}
