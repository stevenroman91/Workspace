package service;

import java.util.List;

import model.Client;

public interface ClientService {
	
	public void addClient(Client c);
	public Client getValidatedClient(int id);
	public List<Client> getAllClients();
	public void deleteClient(int id);
}
