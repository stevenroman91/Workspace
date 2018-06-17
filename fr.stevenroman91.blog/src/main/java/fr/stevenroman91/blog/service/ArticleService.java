package fr.stevenroman91.blog.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import fr.stevenroman91.blog.domain.Article;

public class ArticleService {

	// atributs
	private static final List<Article> MOCK_ARTICLES = Collections.unmodifiableList(Arrays.asList(new Article[] {
			new Article(0, "Article 1",
					"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam nec ex nec ligula cursus pellentesque sed ut augue. Proin quam dui, suscipit sit amet porta eu, venenatis ac tortor. Maecenas mollis rutrum egestas. Sed sollicitudin eleifend fringilla. Maecenas sed tempor erat. Sed interdum ipsum vitae sem posuere, id finibus purus aliquam. Donec quis condimentum orci. Donec non mauris et lectus tincidunt aliquam. Nunc malesuada est sapien, quis facilisis mauris tincidunt in. "),
			new Article(1, "Article 2",
					"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam nec ex nec ligula cursus pellentesque sed ut augue. Proin quam dui, suscipit sit amet porta eu, venenatis ac tortor. Maecenas mollis rutrum egestas. Sed sollicitudin eleifend fringilla. Maecenas sed tempor erat. Sed interdum ipsum vitae sem posuere, id finibus purus aliquam. Donec quis condimentum orci. Donec non mauris et lectus tincidunt aliquam. Nunc malesuada est sapien, quis facilisis mauris tincidunt in. "),
			new Article(2, "Article 3",
					"Lorem ipsum dolor sit amet, consectetur adipiscing elit. Nam nec ex nec ligula cursus pellentesque sed ut augue. Proin quam dui, suscipit sit amet porta eu, venenatis ac tortor. Maecenas mollis rutrum egestas. Sed sollicitudin eleifend fringilla. Maecenas sed tempor erat. Sed interdum ipsum vitae sem posuere, id finibus purus aliquam. Donec quis condimentum orci. Donec non mauris et lectus tincidunt aliquam. Nunc malesuada est sapien, quis facilisis mauris tincidunt in. ") }));

	private static ArticleService INSTANCE;

	public static ArticleService getSingleton() {
		return ArticleService.INSTANCE;
	}

	public static void prepareSingleton(int idCount) throws UnsupportedOperationException {
		if (ArticleService.INSTANCE == null) {
			ArticleService.INSTANCE = new ArticleService(idCount);
		} else {
			throw new UnsupportedOperationException();
		}
	}

	private int idCount;
	private final List<Article> articles;

	// constructeur
	public ArticleService(int idCount) {
		this.idCount = idCount;
		this.articles = new ArrayList<>();
		// FIXME: A supprmier lorsque l'access BDD est implementé
		this.articles.addAll(ArticleService.MOCK_ARTICLES);
	}

	// methode
	public Article create(final String title, final String description) {

		final Article result = new Article();
		result.setId(this.idCount++);
		result.setTitle(title);
		result.setDescription(description);
		this.articles.add(result);
		return result;

	}

	public void delete(int id) {
		Article toDelete = null;
		for (Article a : this.articles) {
			if (a.getId().equals(id)) {
				toDelete = a;
				break;
			}
		}
		if(toDelete != null) {
			this.articles.remove(toDelete);
		}
	}

	// getters&setters
	public List<Article> getArticles() {
		return articles;
	}

}
