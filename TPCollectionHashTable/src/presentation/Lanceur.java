package presentation;

import java.util.Hashtable;
import java.util.Map;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Object, Object> ht = new Hashtable();
		ht.put(1, "printemps");
		ht.put(2, "automne");
		ht.put(3, "été");
		ht.put(4, "hivers");
		ht.put("toto", "automne");

		for (Map.Entry<Object, Object> entry : ht.entrySet()) {
			System.out.println(entry);
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());

		}

	}

}
