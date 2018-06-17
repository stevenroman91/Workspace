package fr.stevenroman91.blog.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BlogServlet extends HttpServlet{

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		final PrintWriter writer = response.getWriter();
		
		writer.append("<html>");
		writer.append("<body>");
		writer.append("<h1>HelloWorld servlet!!</h1>");
		writer.append("</body>");		
		writer.append("</html>");
		writer.flush();
	}
}
