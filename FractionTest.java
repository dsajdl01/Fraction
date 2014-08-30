package fraction;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Class FractionTest is testing methods of class Fraction
 *
 * @author  David Sajdl
 * @version 20/12/2013
 */
public class FractionTest {
	
	Fraction f1,f2,f3,f4;
	/**
     * Default constructor for test class FractionTest
     */
	public FractionTest(){
    }
	/**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
	 @Before
	    public void setUp(){
	        f1 = new Fraction(7,28);
	        f2 = new Fraction("-30/11");
	        f3 = new Fraction(13,-65);
	        f4 = new Fraction("72324/462");
	    }
	 /**
	     * tests normalization method from class Fraction.  
	     * It calls constructor with 2 integer parameters 
	     *  
	     */
	 	@Test
	    public void testNormalizationWith2InputsI(){
	        assertEquals("1/4", f1.toString());
	    }
	    /**
	     * tests normalization method from class Fraction. 
	     * It calls constructor with 2 integers parameter 
	     * 
	     */
	    @Test
	    public void testNormalizationWith2InputsII(){
	        Fraction textNorII = new Fraction(-868,-28);
	        assertEquals("31", textNorII.toString());
	    }
	    
	    /**
	     * tests normalization method from class Fraction. 
	     * It calls constructor with 1 integers parameter 
	     * 
	     */
	    @Test
	    public void testNormalizationWith1Inputs(){
	        Fraction textNorII = new Fraction(-28);
	        assertEquals("-28", textNorII.toString());
	    }
	    /**
	     * tests normalization method from class Fraction. 
	     * It calls constructor with 1 parameter String 
	     *
	     */
	    @Test
	    public void testNormalizationWith2InputsIII(){
	        assertEquals("156 6/11", f4.toString());
	    }
	    
		/**
	 	 * tests removeSpaces method from class Fraction.
	 	 * It is when the string contains spaces between numbers
	 	 * 
	 	 */
	    @Test 
	    public void testIfSpacesAreRemoved(){
	    	Fraction frcRemove = new Fraction(" - 1 1 /  2    7  ");
	    	assertEquals("-11/27",frcRemove.toString());
	    }
	    /**
	 	 * tests removeSpaces method from class Fraction.
	 	 * It is when the string contains spaces between numbers
	 	 * 
	 	 */
	    @Test 
	    public void testIfSpacesAreRemovedII(){
	    	Fraction frcRemove = new Fraction("  1 2 / - 2    4  ");
	    	assertEquals("-1/2",frcRemove.toString());
	    }
	    /**
	     * 
	     * tests checkFraction method from class Fraction.
	     * It is when input string is incorrectly
	     * 
	     */
	    @Test
	    public void testIncorrectInputI(){
	    	Fraction inc = new Fraction("/5");
	    	assertEquals("0",inc.toString());
	    }
	    /**
	     * 
	     * tests checkFraction method from class Fraction.
	     * It is when input string is incorrectly
	     * 
	     */
	    @Test
	    public void testIncorrectInputII(){
	    	Fraction inc = new Fraction("5/");
	    	assertEquals("0",inc.toString());
	    }
	    /**
	     * 
	     * tests checkFraction method from class Fraction.
	     * It is when input string is incorrectly
	     * 
	     */
	    @Test
	    public void testIncorrectInputIII(){
	    	Fraction inc = new Fraction("2 / 2 -5");
	    	assertEquals("0",inc.toString());
	    }
	    /**
	     * tests getFraction method from class fraction
	     * it is when numerator is zero
	     * 
	     */
	    @Test
	    public void testEntryZero(){
	        Fraction textNorI = new Fraction(0,28);
	        assertEquals("0",textNorI.toString());
	    }
	    
	    /**
	     * tests getFraction method from class fraction
	     * it is when numerator is greater than 99999999
	     * 
	     */
	    @Test
	    public void testBigIntegerN(){
	        Fraction textNorI = new Fraction(182765124,122);
	        assertEquals("0",textNorI.toString());
	    }
	    /**
	     * tests getFraction method from class fraction
	     * it is when denominator is greater than 99999999
	     * 
	     */
	    @Test
	    public void testBigIntegerD(){
	        Fraction textNorI = new Fraction(23,100000000);
	        assertEquals("0",textNorI.toString());
	    }
	    /**
	     * tests getFraction method from class fraction
	     * it is when denominator is equal to 99999999
	     * 
	     */
	    @Test
	    public void testBigInteger(){
	        Fraction textNorI = new Fraction(99999999);
	        assertEquals("99999999",textNorI.toString());
	    }
	    
	    /**
	     * test equals method from class Fraction
	     * it checks if fraction is not equal to other fraction. 
	     *
	     */
	    @Test
	    public void testNotEquals(){
	        assertNotEquals(true,f2.equals(f1));
	    }
	    
	    /**
	     * test equals method from class Fraction
	     * it checks if fraction is equal to other fraction. 
	     *
	     */
	    @Test
	    public void testEquals(){
	    	Fraction frTest = new Fraction("1/4");
	        assertEquals(true,frTest.equals(f1));
	    }
	 
	    /**
	     * tests abs method from class Fraction. 
	     * it check if fraction is converting into absolute value. 
	     *
	     */
	    @Test
	    public void testAbs(){
	        Fraction testAbs = new Fraction(5,7);
	        Fraction Frac = new Fraction(0);
	        assertEquals("Wrong Answer!",true,Frac.equals(testAbs.abs()));
	    }
	    
	    /**
	     * tests abs method from class Fraction. 
	     * it check if fraction is converting into absolute value. 
	     *
	     */
	    @Test
	    public void testAbsII(){
	        Fraction Frct = new Fraction(2);
	        assertEquals("Wrong Answer!",true,Frct.equals(f2.abs()));
	    }
	    
	    /**
	     * tests abs method from class Fraction. 
	     * it check if fraction is converting into absolute value. 
	     *
	     */
	    @Test
	    public void testAbsIII(){
	        Fraction FrctI = new Fraction(156);
	        assertNotEquals(false,FrctI.equals(f4.abs()));
	    }
	    
	    /**
	     * tests inverse method from class Fraction. 
	     * it checks if fraction or their numerator and denominator were converted. 
	     *
	     */
	    @Test
	    public void testInverse(){
	        Fraction f = new Fraction(4);
	        assertEquals(true,f.equals(f1.inverse()));
	    }
	    
	    /**
	     * tests inverse method from class Fraction. 
	     * it checks if fraction or their numerator and denominator were converted. 
	     *
	     */
	    @Test
	    public void testInverseII(){
	        Fraction fII = new Fraction(-11,30);
	        assertEquals(true,fII.equals(f2.inverse()));
	    }
	    
	    
	    /**
	     * tests inverse method and abs method from class Fraction. 
	     * it checks if fraction or their numerator and denominator were converted
	     * and then if inverted fraction was converted into absolute value.
	     *
	     */
	    @Test
	    public void testinverstAbsAndEquals(){
	        Fraction res = new Fraction(0);
	        assertEquals(true,res.equals(f4.inverse().abs()));
	    }
	    
	    /**
	     * tests add method from class Fraction. 
	     * it checks if two fraction were added and if they produce right result. 
	     *
	     */
	    @Test
	    public void testAddFraction(){
	        Fraction addRes = new Fraction("1692/11");
	        assertEquals(true,addRes.equals(f4.add(f2)));
	    }
	    /**
	     * tests add method from class Fraction. 
	     * it checks if two fraction were added and if they produce right result. 
	     *
	     */
	    @Test
	    public void testAddFractionI(){
	        Fraction addResII = new Fraction("6899/44");
	        assertEquals(true,addResII.equals(f1.add(f4)));
	    }
	    
	    /**
	     * tests sub method from class Fraction.
	     * it checks if two fraction were subtracted and if they produce right result. 
	     *
	     */
	    @Test
	    public void testSubtractionFractionI(){
	        Fraction subResII = new Fraction("-6877/44");
	        assertEquals(true,subResII.equals(f1.sub(f4)));
	    }
	    
	    /**
	     * tests sub method from class Fraction.
	     * it checks if two fraction were subtracted and if they produce right result. 
	     *
	     */
	    @Test
	    public void testSubtractionFractionII(){
	        Fraction subResIII = new Fraction(-139,55);
	        assertEquals(true,subResIII.equals(f2.sub(f3)));
	    }
	   
	    /**
	     * tests mul method from class Fraction.
	     * it checks if two fraction were multiplied and if they produce right result. 
	     *
	     */
	     @Test
	    public void testMultiplyMethod(){
	        Fraction mulRes = new Fraction("861/22");
	        assertEquals(true,mulRes.equals(f1.mul(f4)));
	    }
	    
	   /**
		* tests mul method from class Fraction.
		* it checks if two fraction were multiplied and if they produce right result. 
		*
		*/
	   @Test
	    public void testMultiplyMethodII(){
	        Fraction mulResIII = new Fraction(-1722,55);
	        assertEquals(true,mulResIII.equals(f4.mul(f3)));
	    }
	    
	   /**
	    * tests mul method from class Fraction.
		* it checks if two fraction were multiplied and if they produce right result. 
		*
		*/
	    @Test
	    public void testMultiplyMethodIII(){
	        Fraction mulResIV = new Fraction("-51660/121");
	        assertEquals(true,mulResIV.equals(f4.mul(f2)));
	    }
	    
	    /**
	     * tests div method from class Fraction.
	     * it checks if two fraction were divided and if they produce right result. 
	     *
	     */
	     @Test
	    public void testDivideMethod(){
	        Fraction divRes = new Fraction("-287/5");
	        assertEquals(true,divRes.equals(f4.div(f2)));
	    }
	    
	    /**
		 * tests div method from class Fraction.
		 * it checks if two fraction were divided and if they produce right result. 
		 *
		 */
	    @Test
	    public void testDivideMethodII(){
	        Fraction divResII = new Fraction(6888,11);
	        assertEquals(true,divResII.equals(f4.div(f1)));
	    }
	    
	    /**
	     * tests div method from class Fraction.
	     * it checks if two fraction were divided and if they produce right result. 
	     *
	     */
	    @Test
	    public void testDivideMethodIII(){
	        Fraction divResIII = new Fraction(150,11);
	        assertEquals(true,divResIII.equals(f2.div(f3)));
	    }
	    
	    /**
	     * tests div method from class Fraction.
	     * it checks if two fraction were divided and if they produce right result. 
	     *
	     */
	    @Test
	    public void testDivideMethodIV(){
	        Fraction divResIV = new Fraction(-5,4);
	        assertEquals(true,divResIV.equals(f1.div(f3)));
	    }
	    
	    /**
	     * tests negate method from class Fraction.
	     * it checks if positive fraction were converted into negative fraction 
	     */
	    @Test
	    public void testNegateMethod(){
	        Fraction neg = new Fraction("30/11");
	        assertEquals(true,neg.equals(f2.negate()));
	    }
	    
	    /**
	     * tests negate method from class Fraction.
	     * it checks if negative fraction were converted into positive fraction 
	     */
	     @Test
	    public void testNegateMethodII(){
	        Fraction neg = new Fraction("-1/4");
	        assertEquals(true,neg.equals(f1.negate()));
	    }
	    
	   
	    /**
	     * tests greaterThan method from class Fraction.
	     * it checks if first fraction is greater that second fraction 
	     *
	     */
	     @Test
	    public void testGreaterThanMethod(){
	        assertEquals(true,f1.greaterThan(f3));
	    }
	    
	    /**
	     * tests greaterThan method from class Fraction.
		 * it checks if first fraction is greater that second fraction 
		 *
		 */
	     @Test
	    public void testGreaterThanAndNegateMethod(){
	        assertEquals(true,f1.greaterThan(f3.negate()));
	    }
	    
	    
	   /**
	     * tests lessThan method from class Fraction.
	     * it checks if first fraction is smaller that second fraction 
	     *
	     */
	    @Test
	    public void testSmallerThanMethod(){
	        assertEquals(true,f3.lessThan(f1));
	    }
	    
	    /**
	     * tests lessThan method from class Fraction.
	     * it checks if first fraction is smaller that second fraction 
	     *
	     */
	     @Test
	    public void testSmallerThanAndNegateMethod(){
	        assertEquals(true,f3.negate().lessThan(f1));
	    }
	    
	   /**
		* tests lessThan method and negate method from class Fraction.
		* it checks if first fraction is smaller that second fraction 
		*
		*/
	    @Test
	    public void testSmallerThanAndNegateMethodII(){
	        Fraction f5 = new Fraction(1,6);
	        assertEquals(true,f5.lessThan(f3.negate()));
	    }
	    /**
	     * Tears down the test fixture.
	     *
	     * Called after every test case method.
	     */
	
	@After
    public void tearDown(){
        // assign object to null
        f1 = null;
        f2 = null;
        f3 = null;
    }

}
