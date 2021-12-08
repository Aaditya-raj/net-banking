package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.CustomerDAO;
import master.dao.RegisterDAO;

/**
 * Servlet implementation class LoginServe
 */
public class LoginServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String cid=request.getParameter("cid");
		String pass=request.getParameter("pass");
		if(cid.equals("admin") && pass.equals("admin"))
		{
			response.sendRedirect("Admin_menu.jsp");
		}
		else
		{
			boolean flag;
			CustomerDAO cdao = new CustomerDAO();
			flag=cdao.checkLogin(cid, pass); 
			if(flag==true)
			{
				response.sendRedirect("Client_menu.jsp");
			}
			else
			{
				response.sendRedirect("Error.jsp");
			}
		}
	}

}
