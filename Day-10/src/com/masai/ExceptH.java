package com.masai;

public class ExceptH {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Main");
		
		try {
			
			System.out.println("Try block");
			
			String s = " 100";
			String s1 = "50";
			
			int n1 = Integer.parseInt(s);
			int n2 = Integer.parseInt(s1);
			
			int z = n1/n2;
			
			ExHandle e = null;
			
			if(z>5) {
				e = new ExHandle();
			}
			
			e.fun();
			
		} catch (ArithmeticException ae) {
			// TODO: handle exception
			System.out.println("Inside AE catch");
		} catch (NumberFormatException nfe) {
			// TODO: handle exception
			System.out.println("Inside NFE catch");
		}catch(NullPointerException npe) {
			// TODO: handle exception
			System.out.println("Inside NPE catch");
		}catch(Exception ex) {
			System.out.println(ex.getMessage());
			//this block should always be last. 
			// because its a parent class.
		}
	}

}
