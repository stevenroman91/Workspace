package presentation;

import java.io.IOException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.servlet.RequestDispatcher;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Client;
import service.ClientService;
import service.ClientServiceImpl;

@WebServlet(
        name = "EmployeeServlet",
        urlPatterns = {"/client"}
)
public class ClientServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	ClientService clientService = new ClientServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String action = req.getParameter("searchAction");
        if (action!=null){
            searchClientById(req, resp);
        }else{
            List<Client> result = clientService.getAllClient();
            forwardListClients(req, resp, result);
        }
    }

    private void searchClientById(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        int id = Integer.valueOf(req.getParameter("id"));
        Client client = null;
        try {
            client = clientService.getValidatedClient(id);
        } catch (Exception ex) {
            Logger.getLogger(ClientServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        req.setAttribute("client", client);
        req.setAttribute("action", "edit");
        String nextJSP = "/views/new-employee.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        dispatcher.forward(req, resp);
    }

    private void forwardListClients(HttpServletRequest req, HttpServletResponse resp, List<Client> clientList)
            throws ServletException, IOException {
        String nextJSP = "/views/list-clients.jsp";
        RequestDispatcher dispatcher = getServletContext().getRequestDispatcher(nextJSP);
        req.setAttribute("clientList", clientList);
        dispatcher.forward(req, resp);
    }   
    

}
