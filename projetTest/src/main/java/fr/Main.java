package fr;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringBuilder sb= new StringBuilder();
		
		for(int i=1; i<=100; i++) {
			int ss=0;
			if(i%3==0){
				sb.append("buzz");
				ss++;
			}
			if(i%5==0){
				sb.append("feez");
				ss++;
			}
			if(ss==0) {
				sb.append(i);
			}
			//sb.append("\n");

			
		}

		System.out.println(sb);
	}

}
