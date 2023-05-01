package com.masai;

public class Song {
	
	String artist;
	String title;
	
	void play()	{
		System.out.println(artist+" is playing "+ title);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Song s1 = new Song();
		s1.artist = "Arijit";
		s1.title = "Tum hi ho";
		s1.play();
		
		Song s2 = new Song();
		s2.artist = "Jubin";
		s2.title = "Lut gaye";
		s2.play();
	}

}
