package presentation;

import java.util.List;
import java.util.Scanner;

import model.Client;
import service.ClientService;
import service.ClientServiceImpl;

public class Vue {

	ClientService service = new ClientServiceImpl();
	Scanner sc = new Scanner(System.in);
	
	public void showClient() {
		showAllClients();
		System.out.println("Veuillez saisir le id du client que vous voulez afficher:");
		int id = sc.nextInt();
		Client client = service.getValidatedClient(id);
		System.out.println(client);
	}

	public void createClient() {
		System.out.println("Bonjour, vous avez choisis de créer un client.");
		System.out.println("Veuillez rentrer le nom du client que vous voulez creer:");
		String nom = sc.nextLine();
		Client c = new Client(nom);
		service.addClient(c);
	}

	public void deleteClient() {
		System.out.println("Bonjour, vous avez choisis de supprimer un client.");
		//System.out.println(service.getAllClients());
		showAllClients();
		System.out.println("Veuillez saisir le id du client que vous voulez supprimer:");
		int i = sc.nextInt();
		service.deleteClient(i);
	}
	
	public void showAllClients(){
		
		List<Client> list = service.getAllClients();
		
		for(Client cl : list) {
			System.out.println(cl);
		}
	}
	
	
}
