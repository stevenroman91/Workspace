package fr.gtm.blog.business;

import fr.gtm.blog.dao.AuthorRepository;
import fr.gtm.blog.domain.Author;

public class AuthorService extends CrudService<Author> {

	protected AuthorRepository getRepo() {
		return (AuthorRepository) this.repo;
	}
	
	
}
