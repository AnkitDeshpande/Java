package com.masai;

class ScienceMathsStudent extends Science{
	  final static String MATHS_PREFIX = "SM";
	  private float mathsMarks;

	  ScienceMathsStudent(float mathsMarks, float physicsTheoryMarks, float physicsPracticalMarks, float chemistryTheoryMarks, float chemistryPracticalMarks){
	    //write code to set instance variables
		  super(MATHS_PREFIX, physicsTheoryMarks, physicsPracticalMarks, chemistryTheoryMarks, chemistryPracticalMarks);
		  this.mathsMarks = mathsMarks;
	  }

	  //generate required setter and getter methods
	  
	  

	  @Override	
	  public double getPercentage() {
	      double totalMarks = getPhysicsTheoryMarks() + getPhysicsPracticalMarks() + getChemistryTheoryMarks() + getChemistryPracticalMarks() + mathsMarks;
	      double percentage = (totalMarks /300) * 100;
	      return Math.round(percentage * 100.0) / 100.0; // rounding off to two decimal places
	  }
	
		public float getMathsMarks() {
			return mathsMarks;
		}

		public void setMathsMarks(float mathsMarks) {
			this.mathsMarks = mathsMarks;
		}

		public static String getMathsPrefix() {
			return MATHS_PREFIX;
		}
	}