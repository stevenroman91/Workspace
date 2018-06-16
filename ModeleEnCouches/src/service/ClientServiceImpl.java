package service;

import java.util.List;

import dao.ClientDao;
import dao.DBClientDao;
import dao.MemoryClientDao;
import model.Adresse;
import model.Client;
import model.Compte;
import model.ConseillerClientele;

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

	@Override
	public void updateClient(Client c, String nom, String prenom, String email, Adresse adresse) {
		// TODO Auto-generated method stub
		dao.update(c, nom, prenom, email, adresse);
	}

	@Override
	public List<Client> getClients(ConseillerClientele cc) {
		
		return dao.FindClients(cc);
	}

	@Override
	public List<Compte> getComptes(Client c) {
		
		return dao.FindComptes(c);
	}
	
	@Override
	public List<Compte> getdAllComptes(ConseillerClientele cc) {
		
		return dao.FindAllComptes(cc);
	}

	@Override
	public void virementCompteaCompte(Compte c1, Compte c2, double mt) {
		
		try {
			dao.virementCC(c1, c2, mt);
		} catch (MontantNegatifException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
