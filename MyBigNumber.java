/* Author : Nguyen Thanh Dat 
 MSSV 51600012
 Class(file) MyBigNumber use to add two number
 Edited : 25/10/2018 */
package mybignumber;

import static java.lang.Math.abs;
import java.util.Scanner;

public class MyBigNumber{
/* public static void main(String[] args){
	
	// input
	String a;
	String b;
	Scanner sc= new Scanner(System.in);
	System.out.println("Enter first number:");
	a= sc.nextLine();
	System.out.println("Enter second number:");
	b= sc.nextLine();
	
	String c = sum(a,b);
	
	System.out.println(""+c);
}
 */
        /* sum method 
            I do sum two string here by my algorithm
        */  	
	public static String sum( String stringNumber1 , String stringNumber2 ){
		
		// Two variable to get size of string 
		int LengthOfStringNumber1 = stringNumber1.length() ;
		int LengthOfStringNumber2 = stringNumber2.length() ;
		
		// Declare position last of stringNumber1 and stringNumber2 
		int lastPositionOfStringNumber1 = 0 ;
		int lastPositionOfStringNumber2 = 0 ;
		
		// Declare variable sum char by char ;
		int sumCharbyChar = 0 ;
		
		// Declare variable save character when it be take out 
		char saveCharOfStringNumber1 = '0' ;
		char saveCharOfStringNumber2 = '0' ;
		
		// Declare variable result of two-number addition
		String resultOfTwoStringNumberAddition = "" ;
		
		// Declare variable keep 1 value when two number add biggest 10 
		int keepValue1 = 0 ;
		
		// Declare variable max of two string = LengthOfStringNumber1
		int maxOfTwoStringNumber = LengthOfStringNumber1 ;
		
		// if statement to get max of two string 
		if ( LengthOfStringNumber1 < LengthOfStringNumber2 ){
			// use function abs() to get size , then plus it with LengthOfStringNumber1 and we have maxOfTwoStringNumber
			int temp ;// variable temp 
                    temp = abs( LengthOfStringNumber1 - LengthOfStringNumber2 );
                       maxOfTwoStringNumber = LengthOfStringNumber1 + temp ; 
                
                }
		
		/* loop to execute algorithm add two-number 
                    
                */
		for ( int i = 0 ; i < maxOfTwoStringNumber ; i++ ){
			
			// get position of two-number 
			lastPositionOfStringNumber1 = LengthOfStringNumber1 - 1 - i ;
			lastPositionOfStringNumber2 = LengthOfStringNumber2 - 1 - i	;
			
			// if statement to take out char 
			if (( lastPositionOfStringNumber1 >= 0 )||( lastPositionOfStringNumber2 >= 0 )){
				saveCharOfStringNumber1 = stringNumber1.charAt(lastPositionOfStringNumber1) ;
				saveCharOfStringNumber2 = stringNumber2.charAt(lastPositionOfStringNumber2) ;			
			}
			
			// sum char 
			sumCharbyChar = ( saveCharOfStringNumber1 - '0' ) + ( saveCharOfStringNumber2 - '0' ) + keepValue1 ;
			
			// if statement to do at loop ever to last char 
			if ( lastPositionOfStringNumber1 > 0 ){
				resultOfTwoStringNumberAddition += ( sumCharbyChar % 10 ) ;
			} 
			else // when loop at last char
			{
				resultOfTwoStringNumberAddition = sumCharbyChar + resultOfTwoStringNumberAddition ;
			}	
			keepValue1 = sumCharbyChar/10 ;
		} // end loop
		
		// return result 
		return resultOfTwoStringNumberAddition ;
	}


}
