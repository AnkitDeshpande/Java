package com.masai;

class Tester{
  public static void main(String args[]){
    Science sc = null;
    sc = new ScienceMathsStudent(78, 55, 24, 58, 23);
    System.out.println("The total marks of student whose registration number " + sc.getRegistrationNumber() + " is " + sc.getPercentage());
    sc = new ScienceBioStudent(52, 23, 55, 24, 58, 23);
    System.out.println("The total marks of student whose registration number " + sc.getRegistrationNumber() + " is " + sc.getPercentage());
    sc = new ScienceBioStudent(49, 22, 54, 23, 59, 54);
    System.out.println("The total marks of student whose registration number " + sc.getRegistrationNumber() + " is " + sc.getPercentage());
    sc = new ScienceMathsStudent(83, 52, 23, 55, 26);
    System.out.println("The total marks of student whose registration number " + sc.getRegistrationNumber() + " is " + sc.getPercentage());
  }
}

//Output
//The total marks of student whose registration number SM1 is 68.33
//The total marks of student whose registration number SB2 is 78.33
//The total marks of student whose registration number SB3 is 87.00
//The total marks of student whose registration number SM4 is 79.67