package in.ac.adit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ac.adit.dao.OwnerDAOImpl;
import in.ac.adit.model.Owner;


public class AuthenicatorServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       String Username = null;
       String Password = null;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		Owner owner = new Owner();
		Username = request.getParameter("username");
		Password = request.getParameter("password");
		owner.setUsername(Username);
		owner.setPassword(Password);
		if(Username!=""& Password!="") {
		
				OwnerDAOImpl ownerDAOImpl =  new OwnerDAOImpl();
				if(ownerDAOImpl.authenticate(owner)) {
				
				response.sendRedirect("index.jsp");
					
				}else {
					response.sendRedirect("login.jsp");
		}
	}

	}
}
