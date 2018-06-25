package fr.gtm.tp.exo1;

import java.util.InputMismatchException;
import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Exo1 implements Runnable {

	private static final Logger LOGGER = LoggerFactory.getLogger(Exo1.class);

	public static void main(String[] args) {
		new Exo1(args).run();
		// String st = "13.5";
		// int i = Integer.parseInt(st);
		// System.out.println(i);
		// System.out.println(Math.round(i/2));
		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();
	}

	private final String username;

	public Exo1(final String[] args) {
		if (args.length > 0) {
			this.username = args[0];
		} else {
			this.username = null;
			LOGGER.error("Impossible d'exécuter l'application, veuillez démarrer le programme avec un argument");
			System.exit(1);
		}
	}

	private void usage() {
		LOGGER.info("USAGE : exo1 <username>");
		LOGGER.info("\t - username : Votre pseudo.");
	}
	
	private void log(String message) {
		System.out.println(message);
	}

	@Override
	public void run() throws InputMismatchException {

		LOGGER.info("Bienvenue {} !", this.username);
		
		boolean quit=false;
		
		while (!quit) {
			System.out.println("Entrez un nombre:");
			Scanner sc = new Scanner(System.in);
			int i=0;
			try {
				i = sc.nextInt();

			} catch (InputMismatchException e) {
				if(sc.next().equals("exit")) {
					quit = true;
				}else {
					System.err.println("le nombre que vous avez rentré n'est pas un entier");
					
				}
				continue;
			}

			if(i==0) {
				log("Le nombre choisi est 0 et est pair");
			}else if(i>0) {
				log("Le nombre choisi est positif et " .concat(i%2==0 ? "pair":"impair"));
			}else {
				log("Le nombre choisi est negatif et " .concat(i%2==0 ? "pair":"impair"));
			}

			
		}
		
		log("Fermeture du programme.");
	}
}
