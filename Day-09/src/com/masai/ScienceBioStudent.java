package com.masai;

class ScienceBioStudent extends Science{
	  final static String BIO_PREFIX = "SB";
	  private float bioTheoryMarks;
	  private float bioPracticalMarks;

	  //constructor, setter and getter methods

	  ScienceBioStudent(float bioTheoryMarks, float bioPracticalMarks, float physicsTheoryMarks, float physicsPracticalMarks, float chemistryTheoryMarks, float chemistryPracticalMarks){
	    //write code to set instance variables
		  super(BIO_PREFIX, physicsTheoryMarks, physicsPracticalMarks, chemistryTheoryMarks, chemistryPracticalMarks);
		  this.bioTheoryMarks = bioTheoryMarks;
		  this.bioPracticalMarks = bioPracticalMarks;
		  
	  }

		@Override
		  public double getPercentage(){
		    //write code here to return percentage up to two decimal places
			double totalMarks = (getPhysicsTheoryMarks() + getPhysicsPracticalMarks() + getChemistryTheoryMarks() + getChemistryPracticalMarks());
	        double percentage = (totalMarks / 300) * 100;
	        return percentage;
		  }

		public float getBioTheoryMarks() {
	  		return bioTheoryMarks;
	  	}

		public void setBioTheoryMarks(float bioTheoryMarks) {
			this.bioTheoryMarks = bioTheoryMarks;
		}

		public float getBioPracticalMarks() {
			return bioPracticalMarks;
		}

		public void setBioPracticalMarks(float bioPracticalMarks) {
			this.bioPracticalMarks = bioPracticalMarks;
		}

		public static String getBioPrefix() {	
			return BIO_PREFIX;
		}


	}
