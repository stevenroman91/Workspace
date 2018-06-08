package model;

public class Client {

	// Attributs
	private int id;
	private String name;
	
	// Getters & Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	//Constructor
	public Client(String name) {
		super();
		this.name = name;
	}
	
	//toString
	@Override
	public String toString() {
		return "Client [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
	
}
