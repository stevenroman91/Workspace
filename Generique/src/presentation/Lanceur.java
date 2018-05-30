package presentation;

import domaine.Paire;

public class Lanceur {
	
	public static void main(String[] args) {
		
		Paire<String> p = new Paire<String>("Zec","Union");
		
		String x = p.getPremier();
		String y= p.getSecond();
		
		Paire<Integer> p2 = new Paire<Integer>(1,3);
		
		int a = p2.getPremier();
		int b = p2.getSecond();
		
	}
	

}
