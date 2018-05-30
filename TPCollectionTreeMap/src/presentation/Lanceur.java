package presentation;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

import domaine.Empl;
import domaine.MySalaryComp;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* This is how to declare TreeMap */
		System.out.println(
				"-------------------------------EXEMPLE 1 COMPARATEUR NATUREL ENTIER-------------------------------");
		SortedMap<Integer, String> tmap = new TreeMap<Integer, String>();

		/* Adding elements to TreeMap */
		tmap.put(1, "Data1");
		tmap.put(23, "Data2");
		tmap.put(70, "Data3");
		tmap.put(4, "Data4");
		tmap.put(2, "Data5");

		/* Display content using Iterator */
		Set set2 = tmap.entrySet();
		Iterator iterator = set2.iterator();
		while (iterator.hasNext()) {
			Map.Entry mentry = (Map.Entry) iterator.next();
			System.out.print("clé: " + mentry.getKey() + " & Valeur: ");
			System.out.println(mentry.getValue());
		}

		System.out.println(
				"-------------------------------EXEMPLE 2 COMPARATEUR NATUREL STRING-------------------------------");
		// Create a hash map
		SortedMap tm = new TreeMap();

		// Put elements to the map
		tm.put("Zara", 3434.34);
		tm.put("Mahnaz", 123.22);
		tm.put("Ayan", 1378.00);
		tm.put("Daisy", 99.22);
		tm.put("Qadir", -19.08);

		// Get a set of the entries
		Set set = tm.entrySet();

		// Get an iterator
		Iterator i = set.iterator();

		// Display elements
		while (i.hasNext()) {
			Map.Entry me = (Map.Entry) i.next();
			System.out.print(me.getKey() + ": ");
			System.out.println(me.getValue());
		}
		System.out.println();

		// Deposit 1000 into Zara's account
		double balance = ((Double) tm.get("Zara")).doubleValue();
		tm.put("Zara", balance + 1000);
		System.out.println("Zara's new balance: " + tm.get("Zara"));

		System.out.println("-------------------------------EXEMPLE 3 COMPARATEUR CREE-------------------------------");
		// By using name comparator (String comparison)
		SortedMap<Empl, String> tm2 = new TreeMap<Empl, String>(new Comparator<Empl>() {
			@Override
			public int compare(Empl e1, Empl e2) {
				return e1.getName().compareTo(e2.getName());
			}
		});
		tm2.put(new Empl("Ram", 3000), "RAM");
		tm2.put(new Empl("John", 6000), "JOHN");
		tm2.put(new Empl("Crish", 2000), "CRISH");
		tm2.put(new Empl("Tom", 2400), "TOM");
		Set<Empl> keys = tm2.keySet();
		for (Empl key : keys) {
			System.out.println(key + " ==> " + tm2.get(key));
		}
		System.out.println("===================================");
		// By using salary comparator (int comparison)
		SortedMap<Empl, String> trmap = new TreeMap<Empl, String>(new MySalaryComp());
		trmap.put(new Empl("Ram", 3000), "RAM");
		trmap.put(new Empl("John", 6000), "JOHN");
		trmap.put(new Empl("Crish", 2000), "CRISH");
		trmap.put(new Empl("Tom", 2400), "TOM");
		Set<Empl> ks = trmap.keySet();
		for (Empl key : ks) {
			System.out.println(key + " ==> " + trmap.get(key));
		}
	}

}