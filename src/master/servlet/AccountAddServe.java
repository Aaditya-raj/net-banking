package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.AccountDAO;
import master.dto.AccountDTO;

/**
 * Servlet implementation class AccountAddServe
 */
public class AccountAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String accno=request.getParameter("accno");
		String acctyp=request.getParameter("acctyp");
		String date_of_open=request.getParameter("date_of_open");
		String balance=request.getParameter("balance");
		String cid=request.getParameter("cid");
		AccountDTO adto=new AccountDTO();
		adto.setAccno(accno);
		adto.setAcctyp(acctyp);
		adto.setDate_of_open(date_of_open);
		adto.setBalance(balance);
		adto.setCid(cid);
		AccountDAO adao = new AccountDAO();
		adao.insertData(adto);
		response.sendRedirect("AccountReport.jsp");
	} 

}
