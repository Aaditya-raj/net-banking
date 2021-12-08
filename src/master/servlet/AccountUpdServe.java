package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.AccountDAO;
import master.dto.AccountDTO;

/**
 * Servlet implementation class AccountUpdServe
 */
public class AccountUpdServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String accno=request.getParameter("accno");
		String balance=request.getParameter("balance");
		AccountDTO adto=new AccountDTO();
		adto.setAccno(accno);
		adto.setBalance(balance);
		AccountDAO adao = new AccountDAO();
		adao.updateData(adto);
		response.sendRedirect("AccountReport.jsp");
	}

}
