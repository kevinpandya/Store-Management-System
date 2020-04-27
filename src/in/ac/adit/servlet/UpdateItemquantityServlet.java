package in.ac.adit.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ac.adit.dao.ItemDAOImpl;
import in.ac.adit.model.Item;


public class UpdateItemquantityServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/jsp");
		Item item  = new Item();
		item.setItem_id(Integer.parseInt(request.getParameter("item_id")));
		item.setItem_quantity(Integer.parseInt(request.getParameter("item_quantity")));
		
		try {
			ItemDAOImpl itemDAOImpl = new ItemDAOImpl();
				if(itemDAOImpl.Update_item_quantity(item))
					response.sendRedirect("item.jsp");
				else
					response.sendRedirect("updatequantityitem.jsp");
		}catch(Exception e) {
			e.printStackTrace();
			
		}
	}

}
