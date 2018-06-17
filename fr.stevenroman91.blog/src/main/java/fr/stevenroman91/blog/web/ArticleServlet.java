package fr.stevenroman91.blog.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.stevenroman91.blog.service.ArticleService;

public class ArticleServlet  extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/views/article.jsp").forward(request, response);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String title = request.getParameter("titre");
		final String description = request.getParameter("message");
		ArticleService.getSingleton().create(title, description);
		response.sendRedirect(this.getServletContext().getContextPath() + "/articles");
	}

}
