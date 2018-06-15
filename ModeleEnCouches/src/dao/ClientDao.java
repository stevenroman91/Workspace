package dao;

import java.util.List;

import model.Adresse;
import model.Client;
import model.Compte;
import model.ConseillerClientele;

public interface ClientDao {
	
	public void save(Client c);
	public void update(Client c, String nom, String prenom, String email, Adresse adresse );
	public void delete(int id);
	public Client FindById(int id);
	public List<Client> FindAll();
	public List<Client> FindClients(ConseillerClientele cc);
	public List<Compte> FindComptes(Client c);
	
	
	
	
}
