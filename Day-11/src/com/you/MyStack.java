package com.you;

class MyStack implements Stack{
	  private int stack[];
	  private int top;
	  final static int MAX_SIZE = 5;
	  MyStack(){
		    stack = new int[MAX_SIZE];
		    top = -1;
	  }
	  public String toString(){
		  return Stack.displayStackElements(stack);
	  }
	  
	@Override
	public void push(int element) throws OverflowException {
		// TODO Auto-generated method stub
		if (top == MAX_SIZE - 1) {
		            throw new OverflowException("Stack Full");
		 }
		 top++;
		 stack[top] = element;
	}
	@Override
	public int pop() throws UnderflowException {
		// TODO Auto-generated method stub
		if (top == -1) {
			throw new UnderflowException("Stack Empty");
		 }
		 int element = stack[top];
		 top--;
		 return element;
	}
	@Override
	public int peek() throws UnderflowException {
		// TODO Auto-generated method stub
		if (top == -1) {
			throw new UnderflowException("Stack Empty");
		}
		return stack[top];
	}
}