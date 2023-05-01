package com.masai;

public class Demo {
	public static void main(String[] args) {
		
		LgOldTv l = new LgNewTv(); // overrided by lgNewTv
		l.start();
		l.incVol();
		l.changeChannel();
		
		LgNewTv l1 = new LgNewTv();
		l1.start();
		l1.incVol();
		l1.changeChannel();
		l1.playGame();
	}
}
