package dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import model.Adresse;
import model.Client;
import model.Compte;
import model.ConseillerClientele;
import service.MontantNegatifException;

public class MemoryClientDao implements ClientDao {

	private static final Map<Integer,Client> DB = new HashMap<>();
	
	@Override
	public void save(Client c) {
		// TODO Auto-generated method stub
		//c.setId(DB.size() + (int)(Math.random()*10));
		//DB.put(c.getId(), c);
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		DB.remove(id);
		
	}

	@Override
	public Client FindById(int id) {
		// TODO Auto-generated method stub
		Client c = DB.get(id);
		return c;
	}

	@Override
	public List<Client> FindAll() {
		// TODO Auto-generated method stub
		List<Client> list = new ArrayList<Client>(DB.values());
		return list;

	}

	@Override
	public void update(Client c, String nom, String prenom, String email, Adresse adresse) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Client> FindClients(ConseillerClientele cc) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Compte> FindComptes(Client c) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void virementCC(Compte c1, Compte c2, double mt) throws MontantNegatifException {
		// TODO Auto-generated method stub
		
	}

	
}
