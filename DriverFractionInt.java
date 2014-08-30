package fraction;
import java.util.Scanner;

/**
 * Class DriverFractionInt allows user to enter 4 digits numbers 
 * and it create two fractions object.
 * Then it creates pc object (PrintCalculation) and it calls method printCalculation
 *
 * 
 * testing class Function and constructor that accepts two integer. 
 * 
 * @author David Sajdl
 * username dsajdl01
 * @version 10/01/2013
 */
public class DriverFractionInt {

	/**
	 * main allows user to to enter fraction as 2 integer
	 * and then send for process 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		  System.out.println("\t\t\t\tFRACTION\n");
		  System.out.println("This programs calculate fraction. The maximum and minimum number of numerator "
		  				 + "\nand denominator are 99999999 or -99999999. This rule apply either when two"
		  				 + "\nnumbers are added or multiply the and result is graeter than 99999999 or"
		  				 + "\nsmaller than -99999999. it would appear a worning message and result would be zero."
		  				 + "\n\nWhen two fractions are input, they would be added, multiplyed, "
		  				 + "\nsubtracted, divided, inversed, absolution and comparing "
		  				 + "\nif they are greater, smaller or equal.\n\n");
	        boolean cont = true;
	        while(cont){
	            System.out.print("Please enter two fractions as two numbers (integer only)  \nor in first fraction at numerator entry 0 to finish the program "
	            		+ "\n\nPlease first fraction:\nNumerator: ");
	            int num = getNumber();
	            if(num == 0){
	            	cont = false;
	            	System.out.println("\nEND PROGRAM");
	            }
	            else{
		            System.out.print("Denominator: ");
		            int num1 = getNumber();
		            Fraction frc = new Fraction(num,num1);
		            System.out.println();
		            System.out.print("Please enter second fraction:\nNumerator: ");
		            num = getNumber();
		            System.out.print("Denominator: ");
		            num1 = getNumber();
		            Fraction frc1 = new Fraction(num,num1);
		            
		            PrintCalculation pc = new PrintCalculation();
		            pc.printRresult(frc, frc1);
	            }
	         }
	    }
	
	/**
     * allows the user to enter numbers
     * 
     * @return result integer is the users input
     */
    private  static int getNumber(){
        @SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
        while(true){
            if(in.hasNextInt()){
                int result = in.nextInt();
                return result;
            }
            else{
                System.out.print("\""+in.nextLine() + "\" + in not an integer. Please try again: "); 
            }
        }
    }
}
