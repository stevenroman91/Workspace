package presentation;

import java.util.Scanner;

public class Lanceur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// afficher le menu

		System.out.println("----------------- MENU-----------------");
		System.out.println("Tappez 1 pour gerer les comptes:");
		System.out.println("Tappez 2 pour gerer les personnes:");
		System.out.println("Tappez 0 pour sortir:");
		Scanner sc = new Scanner(System.in);
		int choix = sc.nextInt();

		while (choix != 0) {

			if (choix == 1) {

				System.out.println("gestions des comptes");

			}
			if (choix == 2) {

				System.out.println("gestions des personnes");

			} else {

				System.out.println("mauvais choix, merci de resaisir");

			}
			
			System.out.println("Tappez 1 pour gerer les comptes:");
			System.out.println("Tappez 2 pour gerer les personnes:");
			System.out.println("Tappez 0 pour sortir:");

		}

	}

}
