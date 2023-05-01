package com.masai;

public class Demo1 {
	
	public int getPension(int age, int salary) throws CustomException{ // throws annouces exception may occur
		int pension = 0;
		if(age > 40 && age< 100) {
			pension = (age*salary)/100;
		}else {
			CustomException ce = new CustomException("Invalid Age : "+ age);
			
		}
		return pension;
	}

	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		
		
		System.out.println("Main start");
		
		Demo1 d = new Demo1();
		int pension;
		try {
			pension = d.getPension(30, 200000);
			System.out.println(pension);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}
			
		
		System.out.println("Main ends");
		
	}

}
