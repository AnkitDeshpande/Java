package com.you;
import java.util.Scanner;

class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;
        Stack stack = new MyStack();
        do {
            System.out.println("1. Push element to stack");
            System.out.println("2. Pop element from stack");
            System.out.println("3. Get top element of stack");
            System.out.println("4. Display elements of stack");
            System.out.println("5. Exit");
            System.out.print("Enter selection: ");
            choice = sc.nextInt();
            int element = -1;
            try {
                switch (choice) {
                    case 1:
                        System.out.print("Enter element: ");
                        element = sc.nextInt();
                        stack.push(element);
                        break;
                    case 2:
                        element = stack.pop();
                        System.out.println("The popped element is " + element);
                        break;
                    case 3:
                        element = stack.peek();
                        System.out.println("The top element is " + element);
                        break;
                    case 4:
                        System.out.println("Elements of stack: " + stack);
                        break;
                    case 5:
                        System.out.println("Bye bye");
                        break;
                    default:
                        System.out.println("Invalid selection! Try again.");
                }
            } catch (UnderflowException | OverflowException ex) {
                System.out.println("Error: " + ex.getMessage());
            }
        } while (choice != 5);
        sc.close();
    }
}
