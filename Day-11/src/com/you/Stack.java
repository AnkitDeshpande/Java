package com.you;

public interface Stack {
	    void push(int element) throws OverflowException;
	    int pop() throws UnderflowException;
	    int peek() throws UnderflowException;
	    static String displayStackElements(int[] stack) {
	        StringBuilder sb = new StringBuilder();
	        for (int i = 0; i < stack.length; i++) {
	            sb.append(stack[i]);
	            if (i != stack.length - 1) {
	                sb.append(",");
	            }
	        }
	        return sb.toString();
	    }
	}
