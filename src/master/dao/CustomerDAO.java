package master.dao;
import java.sql.*;
import java.util.ArrayList;

import master.dto.CustomerDTO;
import master.utilities.ConnectionFactory;
public class CustomerDAO {
	Connection cn=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	String insert_sql="insert into customer values(?,?,?,?,?,?,?,?,?,?,?,?)";
	String delete_sql="delete from customer where cid=?";
	String update_sql="update customer set password=? where cid=?";
	String select_sql="select * from customer";
	
	public void insertData(CustomerDTO cdto)
	{
		try
		{
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		ps=cn.prepareStatement(insert_sql);
		ps.setString(1, cdto.getCid());
		ps.setString(2, cdto.getCname());
		ps.setString(3, cdto.getCphno());
		ps.setString(4, cdto.getCemail());
		ps.setString(5, cdto.getAdhar());
		ps.setString(6, cdto.getPan());
		ps.setString(7, cdto.getDob());
		ps.setString(8, cdto.getGender());
		ps.setString(9, cdto.getPlotno()); 
		ps.setString(10, cdto.getStreetnm());
		ps.setString(11, cdto.getPincode());
		ps.setString(12, cdto.getPass());
		ps.executeUpdate();
		cn.commit();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public ArrayList getData()
 	{
		ArrayList arr = new ArrayList();
		try
		{
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		st=cn.createStatement();
		rs=st.executeQuery(select_sql);
		while(rs.next())
		{
			CustomerDTO rdto=new CustomerDTO();
			rdto.setCid(rs.getString(1));
			rdto.setCname(rs.getString(2));
			rdto.setCphno(rs.getString(3));
			rdto.setCemail(rs.getString(4));
			rdto.setAdhar(rs.getString(5));
			rdto.setPan(rs.getString(6));
			rdto.setDob(rs.getString(7));
			rdto.setGender(rs.getString(8));
			rdto.setPlotno(rs.getString(9));
			rdto.setStreetnm(rs.getString(10));
			rdto.setPincode(rs.getString(11));
			rdto.setPass(rs.getString(12));
			arr.add(rdto);
		}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return arr;
	}
	public void updateData(CustomerDTO cdto)
	{
		try
		{
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		ps=cn.prepareStatement(update_sql);
		ps.setString(1, cdto.getPass());
		ps.setString(2, cdto.getCid());
		ps.executeUpdate();
		cn.commit();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData(CustomerDTO cdto)
	{
		try
		{
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		ps=cn.prepareStatement(delete_sql);
		ps.setString(1, cdto.getCid());
		ps.executeUpdate();
		cn.commit();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}

	public boolean checkLogin(String cid,String pass)
	{
		boolean flag=false;
		String check_login="select * from customer where cid='"+cid+"' and password='"+pass+"'";
		try
		{
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		st=cn.createStatement();
		rs=st.executeQuery(check_login);
		if(rs.next())
		{
			flag=true;
		}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return flag;
	}
}
