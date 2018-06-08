package dao;

import java.util.List;

import model.Client;

public interface ClientDao {
	
	public void save(Client c);
	public void delete(int id);
	public Client FindById(int id);
	public List<Client> FindAll();
}
