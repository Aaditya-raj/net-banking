package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.AccountDAO;
import master.dao.CustomerDAO;
import master.dto.AccountDTO;
import master.dto.CustomerDTO;

/**
 * Servlet implementation class StatementServe
 */
public class StatementServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String cid=request.getParameter("cid");
		AccountDTO adto=new AccountDTO();
		adto.setCid(cid);
		CustomerDTO cdto=new CustomerDTO();
		cdto.setCid(cid);
		AccountDAO adao = new AccountDAO();
		adao.insertData(adto);
		CustomerDAO cdao=new CustomerDAO();
		cdao.insertData(cdto);
		response.sendRedirect("StatementReport.jsp");
	}

}
