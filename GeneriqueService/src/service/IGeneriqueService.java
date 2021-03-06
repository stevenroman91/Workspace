package service;

import java.util.List;

public interface IGeneriqueService<T> {
	
	public void ajouter(T t);
	public void supprimer(T t);
	public List<T> findAll();
	public abstract void modifier(T t);
	public T rechercher(Integer id);
	public void affiche(List<T> liste);

}
