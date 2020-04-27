package in.ac.adit.servlet;

import java.io.IOException;
//import java.io.IOException;
//import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ac.adit.dao.OwnerDAOImpl;
import in.ac.adit.model.Owner;

public class CreateOwnerServlet extends HttpServlet {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void service(HttpServletRequest request,HttpServletResponse response) throws IOException {
		response.setContentType("text/jsp");
		//PrintWriter out = response.getWriter();
		
		Owner owner = new Owner();
		owner.setUsername(request.getParameter("username"));
		owner.setFirstname(request.getParameter("firstname"));
		owner.setLastname(request.getParameter("lastname"));
		owner.setAge(Integer.parseInt(request.getParameter("age")));
		owner.setGender(request.getParameter("gender"));
		owner.setMobileno(request.getParameter("mobileno"));
		owner.setPassword(request.getParameter("password"));
		
		
		try {
			OwnerDAOImpl ownerDAOImpl = new OwnerDAOImpl();
			
			ownerDAOImpl.createOwner(owner);
			response.sendRedirect("login.jsp");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		response.sendRedirect("signup.jsp");
		}
		
	}
}
