package fr.gtm.blog.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Author implements Entity, Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private LocalDate subDate;
	private Address address;
	private List<Article> articles;
	//GETTERS & SETTERS
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the subDate
	 */
	public LocalDate getSubDate() {
		return subDate;
	}
	/**
	 * @param subDate the subDate to set
	 */
	public void setSubDate(LocalDate subDate) {
		this.subDate = subDate;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}
	/**
	 * @return the articles
	 */
	public List<Article> getArticles() {
		return articles;
	}
	/**
	 * @param articles the articles to set
	 */
	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}
	
	

}
