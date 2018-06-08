package test;

import model.Circle;
import model.CircleCustomEx;

public class testCustomEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			CircleCustomEx c = new CircleCustomEx(-3);
			
			System.out.println(c.toString());
			//c.setRadius(-3);
			//System.out.println(c.toString());
		} catch (InvalidRadiusException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
			//System.out.println("vous avez envoyé un rayon égal à  " + e.getRadius() + ",on ne peut pas accepter un rayon negatif.");
		}
	}

}
