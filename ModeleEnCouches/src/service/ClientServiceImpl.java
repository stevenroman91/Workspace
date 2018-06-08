package service;

import java.util.List;

import dao.ClientDao;
import dao.DBClientDao;
import dao.MemoryClientDao;
import model.Client;

public class ClientServiceImpl implements ClientService {

	
	//private ClientDao dao= new MemoryClientDao();
	private ClientDao dao= new DBClientDao();
	
	@Override
	public void addClient(Client c) {
		// TODO Auto-generated method stub
		dao.save(c);
	}

	@Override
	public Client getValidatedClient(int id) {
		// TODO Auto-generated method stub
		return dao.FindById(id);
	}

	@Override
	public List<Client> getAllClients() {
		// TODO Auto-generated method stub
		return dao.FindAll();
	}

	@Override
	public void deleteClient(int id) {
		// TODO Auto-generated method stub
		dao.delete(id);
	}

}
