package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import dao.ClientRepository;
import model.Client;

public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository dao;

	/**
	 * Méthode permettant d'ajouter un client en BDD
	 * 
	 */
	@Override
	public void saveClient(Client c) {
		if (c.getName().length() < 5) {
			System.out.println("Le nom doit comporter 5 caractères au minimum");
		} else if (c.getName() == null) {
			System.out.println("Merci de saisir un nom");
		} else {
			dao.save(c);
		}
	}

	@Override
	public Client getValidatedClient(int id) {
		Optional<Client> c =  dao.findById(id);
		if(c.isPresent()) {
			return c.get();
		}else {
			return null;
		}
	}

	@Override
	public List<Client> getAllClient() {
		List<Client> clients = new ArrayList<Client>();
		List<Client> clients2 = dao.findAll();
		for (Client client : clients2) {
			Client c = new Client();
			c.setId(client.getId());
			c.setName(client.getName());
			clients.add(c);
		}
		return clients;
	}

	@Override
	public void deleteClient(int id) {
		Client c = new Client();
		c.setId(id);
		dao.delete(c);
	}
}
