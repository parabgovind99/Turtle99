package com.home.practice2025.set3;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class LeetCode20 {
	
	static class Solution {
		
	public boolean isValid(String s) {
        Stack stack = new Stack();
        for(char ch : s.toCharArray()){
            if(ch == '(' || ch == '{' || ch == '['){
                stack.push(ch);
            }
            else{
                if(stack.isEmpty()){
                    return false;
                }
                else{
                    char top = (char)stack.pop();
                    if(ch == ')' && top != '('){
                        return false;
                    }
                    if(ch == '}' && top != '{'){
                        return false;
                    }
                    if(ch == ']' && top != '['){
                        return false;
                    }
                }
            }
        }
        return stack.isEmpty();
    }
}
	
	static class Solution1 {
		
	public boolean isValid(String s) {
	    	
        Map<Character,Character> map = new HashMap<Character,Character>();
        map.put('{', '}');
        map.put('[', ']');
        map.put('(', ')');
	        
        Stack stack = new Stack();
        char arr[] = s.toCharArray();
        for(int i = 0 ; i < arr.length ; i++) {
        	if(map.containsKey(arr[i])) {
        		stack.add(arr[i]);
        	}
        	else if(stack.isEmpty()){
                return false;
            }
            else{
                if(map.get((char)stack.getLast()) == arr[i]) {
    			    stack.pop();
    		    }
    		    else {
    			    return false;
    		    }
            }
        }
        return stack.isEmpty();
    }
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(new LeetCode20.Solution().isValid("(){}[]"));
		System.out.println(new LeetCode20.Solution1().isValid("(]"));
	}
}
