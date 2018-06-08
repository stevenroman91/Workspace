package org.formation;

public class StringvsBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String lievre;
		String tortue = "";
		
		double ti = System.currentTimeMillis();
		for(int i=0; i<100000;i++) {
			tortue += "_" + i;
		}
		double tf = System.currentTimeMillis();
				
		double ti1 = System.currentTimeMillis();
		StringBuilder sb = new StringBuilder();
		for(int i=0; i<100000;i++) {
			sb.append("_");
			sb.append(i);
		}
		lievre=sb.toString();
		double tf1 = System.currentTimeMillis();
		
		System.out.println(lievre.equals(tortue));
		System.out.println(" la tortue a mis " + (tf-ti) + " millisecondes"  );
		System.out.println(" le lièvre a mis " + (tf1-ti1) + " millisecondes"  );
		
	}

}
