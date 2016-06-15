/**
 * 
 */
package controller;

/**
 * @date   : 2016. 6. 14.
 * @author : HyunWoo Lee
 * @file   : Calc.java 
 * @story  : 
*/
public class Calc {
	
	
	public String execute(int op1,String opCode,int op2){
		int result=0;
		
		switch (opCode) {
		case "+":
			result = op1 + op2;
			return op1 + opCode + op2 + " = " + result;
		case "-":
			result = op1 - op2;
			return op1 + opCode + op2 + " = " + result;
		case "*":
			result = op1 * op2;
			return op1 + opCode + op2 + " = " + result;
		case "/":
			result = op1 / op2;
			return op1 + opCode + op2 + " = " + result;
		default:
			result = op1 % op2;
			return op1 + opCode + op2 + " = " + result;
		}
		
		
	}
}
