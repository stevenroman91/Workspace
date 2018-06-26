package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.ClientDAO;
import model.Client;

public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO dao;

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
			if (c.getId() != null) {
				dao.update(c);
			} else {
				dao.create(c);
			}
		}
	}

	@Override
	public Client getValidatedClient(int id) {
		Client c = new Client();
		c.setId(id);
		return dao.read(c);
	}

	@Override
	public List<Client> getAllClient() {
		return dao.findAll();
	}

	@Override
	public void deleteClient(int id) {
		Client c = new Client();
		c.setId(id);
		dao.delete(c);
	}
}
