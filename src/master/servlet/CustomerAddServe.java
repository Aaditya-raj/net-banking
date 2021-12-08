package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.dao.CustomerDAO;
import master.dto.CustomerDTO;

/**
 * Servlet implementation class CustomerAddServe
 */
public class CustomerAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String cid=request.getParameter("cid");
		String cname=request.getParameter("cname");
		String cphno=request.getParameter("cphno");
		String cemail=request.getParameter("cemail");
		String adhar=request.getParameter("adhar");
		String pan=request.getParameter("pan");
		String dob=request.getParameter("dob");
		String gender=request.getParameter("gender");
		String plotno=request.getParameter("plotno");
		String streetnm=request.getParameter("streetnm");
		String pincode=request.getParameter("pincode");
		String pass=request.getParameter("pass");
		CustomerDTO cdto=new CustomerDTO();
		cdto.setCid(cid);
		cdto.setCname(cname);
		cdto.setCphno(cphno);
		cdto.setCemail(cemail);
		cdto.setAdhar(adhar);
		cdto.setPan(pan);
		cdto.setDob(dob);
		cdto.setGender(gender);
		cdto.setPlotno(plotno);
		cdto.setStreetnm(streetnm);
		cdto.setPincode(pincode);
		cdto.setPass(pass);
		CustomerDAO cdao = new CustomerDAO();
		cdao.insertData(cdto);
		response.sendRedirect("CustomerReport.jsp");
	}

}
