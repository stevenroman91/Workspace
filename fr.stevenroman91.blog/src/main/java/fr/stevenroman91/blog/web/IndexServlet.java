package fr.stevenroman91.blog.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.stevenroman91.blog.service.ArticleService;

public class IndexServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	//private ArticleService service;

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		// super.init(); -> inutile car vide dans HttpServlet
		final int idCount = Integer.parseInt(this.getInitParameter("idCount"));
		ArticleService.prepareSingleton(idCount);
	}

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.getSession().setAttribute("listeArticle",ArticleService.getSingleton().getArticles());
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/index.jsp").forward(request, response);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		/*final String title = req.getParameter("titre");
		final String description = req.getParameter("message");
		ArticleService.getSingleton().create(title, description);
		this.doGet(req, resp);*/
	}

}
