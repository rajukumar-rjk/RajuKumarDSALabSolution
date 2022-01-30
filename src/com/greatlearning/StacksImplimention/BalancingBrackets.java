package com.greatlearning.StacksImplimention;
import java.util.*;

public class BalancingBrackets {
	
	 public boolean checkingBracketBalanced(String expr) {
		 
		 Deque<Character> stack = new ArrayDeque<Character>();
		 
		 for (int i = 0; i < expr.length(); i++)
	        {
	            char x = expr.charAt(i);
	 
	            if (x == '(' || x == '[' || x == '{')
	            {

	                stack.push(x);
	                continue;
	            }
	 
	            if (stack.isEmpty())
	                return false;

	            char check;
	            switch (x) {
	            case ')':
	                check = stack.pop();
	                if (check == '{' || check == '[')
	                    return false;
	                break;
	 
	            case '}':
	                check = stack.pop();
	                if (check == '(' || check == '[')
	                    return false;
	                break;
	 
	            case ']':
	                check = stack.pop();
	                if (check == '(' || check == '{')
	                    return false;
	                break;
	            }
	        }
	 
	        // Checking Empty Stack
	        return (stack.isEmpty());
	 }
}
