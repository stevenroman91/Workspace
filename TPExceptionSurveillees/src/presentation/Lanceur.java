package presentation;

import java.io.InputStream;
import java.util.InputMismatchException;
import java.util.Scanner;

import domaine.Compte;
import domaine.MontantNegatifException;
import domaine.SoldeInsuffisantException;

/**
 * Classe principale
 * @author Steven
 *
 */
public class Lanceur {

/**
 * Méthode main
 * @param args parametre principal
 */
	public static void main(String[] args) {
		
		
		float f = 10;
		double d=(double) f;
		Double d1 = d;
		
		Compte cp = new Compte();
		Scanner scan = new Scanner(System.in);
		
		System.out.println("MONTANT A VERSER:");
		
		try {
			double mt = scan.nextDouble();
			cp.verser(mt);
			System.out.println("COMPTE APRES VERSEMENT:");
			System.out.println(cp);
			System.out.println("MONTANT A RETIRER:");
			mt = scan.nextDouble();
			cp.retirer(mt);
			System.out.println("ETAT FINAL DU COMPTE");
			System.out.println(cp);
		} catch (MontantNegatifException e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("Saisie incorrect");
		}catch (SoldeInsuffisantException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
		finally {
			scan.close();
			
		}
		
		
		
		
		

	}

}
