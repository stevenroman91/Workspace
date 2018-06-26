package presentation;

import model.Client;
import service.ClientService;
import service.ClientServiceImpl;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClientService service = new ClientServiceImpl();
		//System.out.println("--------------------------------------------------------------------------------------------------------------------------connecteeeeeeeeeeeee");
		//System.out.println(service.getAllClient());
		//Client client = new Client(1, "Jerémy");
		Client client = service.getValidatedClient(1);
		System.out.println(client);
	}

}
