package com.greatlearning.main;
import com.greatlearning.StacksImplimention.*;

public class FindBalancingBrackets {

	private static BalancingBrackets checkBracket = new BalancingBrackets();
	public static void main(String args[]) {
		String bracketExpression = "([[{}]])";
		Boolean result;
		
		result = checkBracket.checkingBracketBalanced(bracketExpression);
		
		if(result){
			System.out.println("The entered String has Balanced Brackets");
		}else {
			System.out.println("The entered Strings do not contain Balanced Brackets");			
		}
	}
}
