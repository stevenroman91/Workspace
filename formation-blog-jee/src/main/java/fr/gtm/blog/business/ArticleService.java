package fr.gtm.blog.business;

import fr.gtm.blog.domain.Article;

/**
 * Couche métier de l'application : Gérer les informations des articles,
 * intermédiaire entre la présentation et la persistance.
 */
public class ArticleService extends CrudService<Article> {

	@Override
	public Article create(Article entity) {
		/*if (entity.getAuthor() != null && (entity.getAuthor().getId() != null
				|| entity.getAuthor().getName() != null)) {*/
			return super.create(entity);
		/*} else {
			throw new IllegalArgumentException("IMPOSSIBLE DE CREER UN ARTICLE SANS AUTEUR.");
		}*/
	}

}
