package fraction;

/**
 * Class PrintCalculation prints result of multiplication, subtraction, 
 * division two fraction. It also compares if they are greater, 
 * smaller or equal and second fraction is inverse and put into absolution number.
 * 
 * It tests class Function and constructor that accepts String.
 * 
 * @author David Sajdl
 * username dsajdl01
 * @version 10/01/2013
 */
public class PrintCalculation {

	/**
	 * Constructor
	 * 
	 */
	public PrintCalculation() {
		
	}
	
	/**
	 * prints results of multiplication, subtraction, 
	 * division two fraction. It also compares if they are greater, 
	 * smaller or equal and second fraction is inverse and put into absolution number.
	 * 
	 * @param frc 
	 * @param frc1
	 */
	public void printRresult(Fraction frc, Fraction frc1){
		System.out.println("\n\n\n\nYour first fraction " + frc);
        System.out.println("Your second fraction: "+ frc1);
        Fraction add1 = frc.add(frc1);        
        System.out.println("\nAdding     \t" + frc + " + " + frc1 + " = " + add1);
        Fraction sub1 = frc.sub(frc1);
        System.out.println("\nSubtracting\t" + frc + " - " + frc1 + " = " + sub1);
        Fraction mul1 = frc.mul(frc1);
        System.out.println("\nMultiplying\t" + frc + " * " + frc1 + " = " + mul1);
        Fraction dv1 = frc.div(frc1);
        System.out.println("\nDividing   \t" + frc + " / " + frc1 + " = " + dv1);
        Fraction inv1 = frc.inverse();
        System.out.println("\nInversing  \t"+ frc + " = " + inv1);
        Fraction neg1 = frc.negate();
        System.out.println("\nNegating   \t" + " = " + neg1);
        Fraction ab1 = frc.abs();
        System.out.println("\nabsolution \t" + " = " + ab1);
        System.out.println("\n\nComparing those two fraction");
        boolean gr1 = frc.greaterThan(frc1);
        System.out.println("\nif " + frc + " is greater than "+ frc1 + " = " + gr1);
        boolean less1 = frc.lessThan(frc1);
        System.out.println("\nif " + frc + " is less than    "+ frc1 + " = " + less1);
        boolean eq1 = frc.equals(frc1);
        System.out.println("\nif " + frc + " is equal to     "+ frc1 + " = " +  eq1 +"\n");
	}

}
