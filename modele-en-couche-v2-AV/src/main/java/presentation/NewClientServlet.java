package presentation;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import model.Client;
import service.ClientService;

public class NewClientServlet extends AutowiredServlet {

	private static final Logger LOGGER = LoggerFactory.getLogger(ViewsServlet.class);
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private ClientService service;
	
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		final String name = request.getParameter("name");
		this.service.saveClient(new Client(name));
		response.sendRedirect(request.getContextPath() + "/show-all.html");
	}


}
