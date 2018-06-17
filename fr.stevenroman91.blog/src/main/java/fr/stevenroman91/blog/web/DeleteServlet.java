package fr.stevenroman91.blog.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr.stevenroman91.blog.service.ArticleService;

public class DeleteServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		final String strId = request.getParameter("id");
		ArticleService.getSingleton().delete(Integer.parseInt(strId));
		response.sendRedirect(this.getServletContext().getContextPath()+"/articles");
	}
	
}
