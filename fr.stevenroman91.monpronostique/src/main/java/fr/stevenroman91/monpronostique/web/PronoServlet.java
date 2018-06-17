/**
 * 
 */
package fr.stevenroman91.monpronostique.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author Adminl
 *
 */
public class PronoServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		final PrintWriter writer = resp.getWriter();

		writer.append("<html>");
		writer.append("<head>");
		writer.append("<meta charset=\"UTF-8\"/>");
		writer.append("<link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css\" />");		
		writer.append("</head>");
		writer.append("<body>");
		writer.append("<div class=\"container\">");
		writer.append("<div class=\"row\">");		
		writer.append("<h1 class=\"col-md-12\">Pronostiques des matchs de la coupe du monde</h1>");
		writer.append("<h2 class=\"col-md-12\">Match: France - Australie</h2>");
		writer.append("<ol>");
		writer.append("<li>Pronostique: France 4 - 1 Australie</li>");
		writer.append("<li>Pronostique: Australie 0 - 1 France</li>");
		writer.append("</ol>");
		writer.append("</div>");
		writer.append("</div>");
		writer.append("</body>");
		writer.append("</html>");
		writer.flush();
	}
}
