package service;

import java.util.List;

import model.Adresse;
import model.Client;
import model.Compte;
import model.ConseillerClientele;

public interface ClientService {
	
	public void addClient(Client c);
	public Client getValidatedClient(int id);
	public List<Client> getAllClients();
	public void deleteClient(int id);
	
	public void updateClient(Client c, String nom, String prenom, String email, Adresse adresse );
	public List<Client> getClients(ConseillerClientele cc); 
	public List<Compte> getComptes(Client c);
	public List<Compte> getdAllComptes(ConseillerClientele cc);
	public void virementCompteaCompte(Compte c1, Compte c2, double mt);
}
