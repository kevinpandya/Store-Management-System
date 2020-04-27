package in.ac.adit.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.ac.adit.model.Item;


public class BillgenerationServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/jsp");
		PrintWriter out = response.getWriter();
		Item item = new Item();
		int total = 0;
		
		item.setItem_id(Integer.parseInt(request.getParameter("item_id")));
		item.setItem_name(request.getParameter("item_name"));
		item.setItem_price(Integer.parseInt(request.getParameter("item_price")));
		item.setItem_quantity(Integer.parseInt(request.getParameter("item_quantity")));
		total = total + (item.getItem_price()*item.getItem_quantity());
		out.print("the bill is :"+ total);
	}

}
