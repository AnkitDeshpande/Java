package com.masia;

public class NameVowelConsonant {
    static int getVowelCount(String name) {
        int count = 0;
		String Vowels = "aeiouAEIOU";
        for (int i = 0; i < Vowels.length(); i++) {
            for (int j = 0; j < name.length(); j++) {
                if(Vowels.charAt(i)==name.charAt(j)){
                    count++;
                }
            }
        }
        return count;
  }

  public static void main(String[] args) {
    System.out.println("Total vowel in Ankit is " + getVowelCount("Ankit"));
  }
}
