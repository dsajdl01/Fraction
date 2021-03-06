package fraction;
/**
 * Class Fraction check if the fractions are in correct value
 * then normalize Fraction and calculate fractions. 
 * It also check if one fraction is greater or smaller that other fraction
 * or fractions are equal to each other. 
 * 
 * @author David Sajdl
 * username dsajdl01
 * @version 20/12/2013
 */
public class Fraction {
    private int n;
    private int d; 
    /**
     * Constructor with two parameter
     * 
     * @param n integer as numerator on the Fraction
     * @param d integer as denominator of the Fraction
     */
    public Fraction(int n, int d){
        this.getFraction(n,d);
    }
    
    /**
     * Constructor with one parameter
     * 
     * @param n integer as numerator on the Fraction
     */
     public Fraction(int n){
          this.getFraction(n, 1);
        }
        
     /**
     * Constructor with one parameter
     * 
     * @param strFraction string as numerator and denominator on the Fraction
     */
      public Fraction(String strFraction){
          strFraction = removeSpaces(strFraction);  
    	  this.setStringFraction(strFraction);
                
      }
      /**
       * removes white spaces from the string 
       * 
       * @param st String that is fraction number from user input
       * @return trim String  fraction that does not contain white spaces
       */
      private String removeSpaces(String st){
          String trim = ""; 
          for(int i = 0; i < st.length();i++){
              if(!st.substring(i,i+1).equals(" ")){
               trim = trim + st.substring(i,i+1);
              }   
          }
          return trim;
      }
     /**
     * assigns values for instance variables "numerator and denominator"
     * 
     * @param  n is integer as numerator of the Fraction number
     * @param  d is integer as denominator of the Fraction number 
     */
      public void getFraction(int n, int d){
    	if(n == 0){System.out.print("Invalid fraction! Numerator cannot be zero");
    	}
    	else if(testInteger(n,d)){
   		 	System.out.println("The maximum entered number or result of the numerator and denominator must be smaller than " + Integer.MAX_VALUE
   		 			+ "\nand the minimum entered number or result of the numerator and denominator must be greater than " + Integer.MIN_VALUE
   		 			+ ".\nNumerator was assigned to zero.");
   		 	this.n = 0;
   		 	this.d = 0;
    	}
      	else{
    	  this.n = n;
          this.d = d;
          if(d != 1){
                normalization();
            }
      	}
      }
      
      /**
       * checks if numerator and denominator is not greater then 2147483646 
       * or if numerator and denominator is not smaller than -2147483647
       * 
       * @param  n is integer as numerator of the Fraction number
       * @param  d is integer as denominator of the Fraction number
       * 
       *  @return true if numerator and denominator is in the range between 2147483646 to -2147483647
       *  otherwise return false
       */
      private boolean testInteger(int n, int d){
  		if(n >= Integer.MAX_VALUE) return true;
  		else if (d >= Integer.MAX_VALUE) return true;
  		else if (n <= Integer.MIN_VALUE) return true;
  		else if (d <= Integer.MIN_VALUE) return true;
  		else return false;
  	}
     
     /**
     * checks whether the string contain correct value (fraction within 5 digits)
     * if is correct value string is passed string for another process else it print error message
     * 
     * @param  strFraction string that contain Fraction number 
     */
     public void setStringFraction(String strFraction){
            if(checkString(strFraction)){
                getFractionNumber(strFraction);
            }
            else{
                if(checkFraction(strFraction)){
                	System.out.println(strFraction);
                    System.out.println("The maximum and minimum number of numerator or denominator "
                    		+ "that can be entered is: + " + Integer.MAX_VALUE + " " + Integer.MIN_VALUE + "!!!!");
                }
                else{
                    System.out.println("This in invalid fruction number " + strFraction);
                }
            }
     }
     /**
      *checks if string contains fraction number
      *
      *@param s string as fraction number
      *@return s.matches(regExp) true/false if string contains fraction number it returns true else return false
      */
     private boolean checkFraction(String s){
        String regExp = "^[-]?[0-10]|[-]?[0-10]+/+[-]?[0-10]+$";
        return s.matches(regExp);
    }
      /**
     * checks if the string contains correct value 
     * 
     * 
     * @param num is string that contain Fraction number
     * @return num.matches(regExp)"true/false" if the string contain Fraction it returns true otherwise false
     */
      private boolean checkString(String num){
          String regExp = "^[-]?[0-9]{1,10}|[-]?[0-9]{1,10}+/+[-]?[0-9]{1,10}+$";
          return num.matches(regExp);
      }
     /**
     * converts string into integers: numerator and denominator  
     * 
     * @param is string that contain Fraction number
     */ 
      private void getFractionNumber(String strNum){
        long n1, d1;
    	  
    	 if((strNum.indexOf("/") < 0)){
                n1 = Long.parseLong(strNum);
    		 	if(n1 == 0){
    		 		System.out.print("invalid fruction!!! numerator cannot be zero");
    		 	}
    		 	else if(checkIntegers(n1,1)){
    		 		System.out.println(strNum + " numerator is out of range. It mus be smaller than " + Integer.MAX_VALUE 
    		 				+ " of greater than " + Integer.MIN_VALUE);
    		 	}
    		 	else{
    		 		this.n = (int)n1; 
    		 		this.d = 1;
    		 	}
        }
        else{
            String strAr[] = strNum.split("/");
            n1 = Long.parseLong(strAr[0]);
            d1 = Long.parseLong(strAr[1]);
            if(n1 == 0){
            	System.out.print("invalid fruction!!! numerator cannot be zero");
            }
            else if(checkIntegers(n1,d1)){
		 		System.out.println(strNum + " numerator is out of range. It mus be smaller than " + Integer.MAX_VALUE 
		 				+ " of greater than " + Integer.MIN_VALUE);
		 	}
            else{
            	this.n = (int)n1;
            	this.d = (int)d1;
            	if(this.d != 1){
                    normalization(); }
            }
        }
     }
     /**
     * keeps Fraction (numerator and denominator) in normalized form 
     *  
     */
      private void normalization(){
          int a = 0; int b = 0;
          if(n < 0 && d < 0){n = -n;
              d = -d;}
          else if(d < 0){n = -n;
              d = -d;}   
          if(n < 0){a = -n;
              b = d;}
          else{a = n;
              b = d;}
          while(b>0){
              int temp = b;
              b = a%b;
              a = temp;
          }     
          this.n = n/a;
          this.d = d/a;
      }
     /**
     * represents the current object or converts numerator and denominator into string  
     * 
     * @return  string as a Fraction 
     */
      @Override
      public String toString() {
            if(n == 0 || d == 0) return "0";
             else if(d == 1) return n+""; 
             else if(n < 0){   
            	 int positive = n * (-1);
                 if(positive > d){ return n/d + " " + positive%d + "/" + d;}
                 else return n + "/" + d;
                 }
            else if(n > d) return n/d + " " + n%d + "/" + d;
            else return n + "/" + d;
     }
     
     /**
     * converts Fraction number, their numerator and denominator, into absolute value  
     * 
     * @return  FractionAbs object as absolute value 
     */
    public Fraction abs(){
        if(n == 0){
            System.out.print("Is invalid fraction ");
            return new Fraction(0);
        }
        else if(n>0) return  new Fraction(n/d);
        else return new Fraction(-n/d);
    }
     /**
     * converts positive Fraction into negative and other way round  
     * 
     * @return negRes is object as Fraction number 
     */
    public Fraction negate(){
        int neg = n*(-1);
          return new Fraction(neg + "/" + d);
        }
     
    /**
     * inverses Fraction numerator to denominator and denominator to numerator
     * 
     * @return FractionInvers is object as inverse Fraction number 
     */
    public Fraction inverse(){
         return new Fraction(d + "/" + n);
    }
    
    /**
     * compares two Fractions "objects" if their are equal
     * 
     * @param o as object
     * @return true/false if Fractions are equal return true otherwise false 
     */
    public boolean equals(Object o){
        if (getClass() != o.getClass())return false;
        Fraction other = (Fraction) o;
        if (other != null && other instanceof Fraction){ 
            return (n == other.n) && (d == other.d);}
       return false;
    }
    /**
     * compares two Fractions "objects" if first one is greater than second one
     * 
     * @param f as Fraction object that contain Fraction number
     * @return true/false if the first Fraction is greater than second one its return true otherwise false 
     */
    public boolean greaterThan(Fraction f){
        if((long)n*f.d > (long)d*f.n) return true;
        return false;
    }
    /**
     * compares two Fractions "objects" if the first one is less than second one
     * 
     * @param f as object that contain Fraction number
     * @return true/false if the first Fraction is less than second one its return true otherwise false 
     */
    public boolean lessThan(Fraction f){
        if((long)n*f.d < (long)d*f.n) return true;
        return false;
    }
    
    /**
     * adds two Fractions "objects" and provide their result
     * 
     * @param frcNum as object that contain Fraction number
     * @return addResults objects is a sum of two added Fraction. 
     * If the adding result is out of the range returns null 
     */
    public Fraction add(Fraction frcNum) {
    	
    	long result = (long)this.n * (long)frcNum.d + (long)this.d + (long)frcNum.n;
    	long result2 = (long)this.d * (long)frcNum.d;
    	if(checkIntegers(result,result2)){
    		System.out.println("Adding result is out of the integer range. The result is assigned to null");
    		return null;
    	}
    	return new Fraction(this.n*frcNum.d + this.d*frcNum.n, this.d*frcNum.d);
    }
    
    /**
     * subtracts two Fractions "objects"and provide result
     * 
     * @param frcNum as object that contain Fraction number
     * @return sudResults objects is a subtraction of two subtract Fraction.
     * If the subtraction result is out of the range returns null  
     */
    public Fraction sub(Fraction frcNum) {
    	long result = (long)this.n * (long)frcNum.d - (long)this.d + (long)frcNum.n;
    	long result2 = (long)this.d * (long)frcNum.d;
    	if(checkIntegers(result,result2)){
    		System.out.println("Subtracting result is out of the integer range. The result is assigned to null");
    		return null;
    	}
    	return new Fraction(this.n*frcNum.d - this.d*frcNum.n, this.d*frcNum.d);
     }
        
    /**
     *  multiplies two Fractions "objects"and provide result
     * 
     * @param frcNum as object that contain Fraction number
     * @return mulResults objects is a multiplication of two multiply Fraction. 
     * If the multiplying result is out of the range returns null 
     */ 
    public Fraction mul(Fraction frcNum) {
    	long result = (long)this.n * (long)frcNum.n;
    	long result2 = (long)this.d * (long)frcNum.d;
    	if(checkIntegers(result,result2)){
    		System.out.println("Multiplying result is out of the integer range. The result is assigned to null");
    		return null;
    	}
        return new Fraction(this.n*frcNum.n, this.d*frcNum.d);
    }
    /**
     * divided two Fractions "objects"and provide result
     * 
     * @param frcNum as object that contain Fraction number
     * @return mulResults objects is a division of two divided Fraction. 
     * If the division result is out of the range returns null 
     */ 
    public Fraction div(Fraction frcNum) {
    	long result = (long)this.n * (long)frcNum.d;
    	long result2 = (long)this.d * (long)frcNum.n;
    	if(checkIntegers(result,result2)){
    		System.out.println("Dividing result is out of the integer range. The result is assigned to null");
    		return null;
    	}
        return new Fraction(this.n*frcNum.d, this.d*frcNum.n);
        
    }
    /**
     * checks if the income long numbers are not greater then 2147483646 
     * or if are not smaller than -2147483647
     * 
     * @param  a is long as result of the Fraction number
     * @param  b is long as denominator of the Fraction number
     * 
     *  @return true if the numbers are in the range between 2147483646 to -2147483647
     *  otherwise return false
     */
    private boolean checkIntegers(long a, long b){
    	if(a >= Integer.MAX_VALUE) return true;
  		else if (b >= Integer.MAX_VALUE) return true;
  		else if (a <= Integer.MIN_VALUE) return true;
  		else if (b <= Integer.MIN_VALUE) return true;
    	return false;
    }
}