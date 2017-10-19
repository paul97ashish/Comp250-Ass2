package assignments2017.A2PostedCode;

/*

 */

import java.util.Stack;
import java.util.ArrayList;
import java.util.Arrays;

public class Expression  {
	private ArrayList<String> tokenList;

	//  Constructor    
	/**
	 * The constructor takes in an expression as a string
	 * and tokenizes it (breaks it up into meaningful units)
	 * These tokens are then stored in an array list 'tokenList'.
	 */

	Expression(String expressionString) throws IllegalArgumentException{
		tokenList = new ArrayList<String>();
		StringBuilder token = new StringBuilder();

		//ADD YOUR CODE BELOW HERE
	     String exp1 = expressionString;
	     
	     for(int i=0; i < exp1.length(); i++){
	         //created char array for pointing purposes
	         char[] exp5 = exp1.toCharArray();
	         
	         //this checks if the char before is a number and not a space and not a left bracket
	         //if above checks out then the token is not cleared and the next number is added
	         if (i > 0 && exp5[i-1] >= '0' && exp5[i-1] <= '9' && exp5[i] != ' ' && exp5[i] != ')'){
                 token.append(exp1.charAt(i));
                 String exp2 = token.toString();
                 tokenList.remove(tokenList.size()-1);
                 tokenList.add(exp2);   
                
             }
	         
	         if (exp5[i] == ' '){
	             i=i;
	         }
	         
	         
	         else {
	         token.setLength(0);
	         token.append(exp1.charAt(i));
	         String exp2 = token.toString();
	         tokenList.add(exp2);
	         }
	     
	     }

		
		
		//ADD YOUR CODE ABOVE HERE
	}

	/**
	 * This method evaluates the expression and returns the value of the expression
	 * Evaluation is done using 2 stack ADTs, operatorStack to store operators
	 * and valueStack to store values and intermediate results.
	 * - You must fill in code to evaluate an expression using 2 stacks
	 */
	public Integer eval(){
		Stack<String> operatorStack = new Stack<String>();
		Stack<Integer> valueStack = new Stack<Integer>();
		
		//ADD YOUR CODE BELOW HERE
		//..
		//..
		//ADD YOUR CODE ABOVE HERE

		return null;   // DELETE THIS LINE
	}

	//Helper methods
	/**
	 * Helper method to test if a string is an integer
	 * Returns true for strings of integers like "456"
	 * and false for string of non-integers like "+"
	 * - DO NOT EDIT THIS METHOD
	 */
	private boolean isInteger(String element){
		try{
			Integer.valueOf(element);
		}catch(NumberFormatException e){
			return false;
		}
		return true;
	}

	/**
	 * Method to help print out the expression stored as a list in tokenList.
	 * - DO NOT EDIT THIS METHOD    
	 */

	@Override
	public String toString(){	
		String s = new String(); 
		for (String t : tokenList )
			s = s + "~"+  t;
		return s;		
	}

}

