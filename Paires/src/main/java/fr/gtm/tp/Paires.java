package fr.gtm.tp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Paires {
	
	public String suiteRandom(){
		
		StringBuilder sb = new StringBuilder();
		for(int i=0;i<100;i++) {
			sb.append((int)(Math.random()*10));
		}		
		return sb.toString();
	}
	
	public int nombreDePaires(String str) {
		
		List<String> myList = new ArrayList<String>(Arrays.asList(str.split("")));
		Collections.sort(myList);
		//System.out.println(myList);
		int res =0;
		int k1=0;
		for(int i=1;i<myList.size();i++) {
			if(!myList.get(i).equals(myList.get(i-1))) {
				//System.out.println(i);
				int k2=i;
				res +=(int)((k2-k1)/2);
				k1=k2;
			}
		}
		
		res +=(int)((myList.size())-k1)/2; 
		if(res==0) {
			res = (int)(myList.size()/2);
		}
		return res;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paires p=new Paires();
		System.out.println(p.suiteRandom());
		System.out.println(p.nombreDePaires(p.suiteRandom()));
	}

}
