package fr.gtm.tp;

public class AfficherNombres {

	public String generateString() {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i <= 100; i++) {
			int ss = 0;
			if (i % 3 == 0) {
				sb.append("buzz");
				ss++;
			}
			if (i % 5 == 0) {
				sb.append("feez");
				ss++;
			}
			if (ss == 0) {
				sb.append(i);
			}
			sb.append(" ");
		}
		//System.out.println(sb);
		return sb.toString();
	}

	public static void main(String[] args) {
		AfficherNombres test = new AfficherNombres();
		System.out.println(test.generateString());
	}
}
