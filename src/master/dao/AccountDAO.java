package master.dao;
import java.sql.*;
import java.util.ArrayList;

import master.dto.AccountDTO;
import master.utilities.ConnectionFactory;
public class AccountDAO {

	Connection cn=null;
	Statement st=null;
	ResultSet rs=null;
	PreparedStatement ps=null;
	String insert_sql="insert into account values(?,?,?,?,?)";
	String delete_sql="delete from account where accno=?";
	String update_sql="update account set balance=? where accno=?";
	String select_sql="select * from account";

	public void insertData(AccountDTO adto)
	{
		try
		{
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		ps=cn.prepareStatement(insert_sql);
		ps.setString(1, adto.getAccno());
		ps.setString(2, adto.getAcctyp());
		ps.setString(3, adto.getDate_of_open());
		ps.setString(4, adto.getBalance());
		ps.setString(5, adto.getCid());
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
			AccountDTO adto=new AccountDTO();
			adto.setAccno(rs.getString(1));
			adto.setAcctyp(rs.getString(2));
			adto.setDate_of_open(rs.getString(3));
			adto.setBalance(rs.getString(4));
			adto.setCid(rs.getString(5));
			arr.add(adto);
		}
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
		return arr;
	}
	public void updateData(AccountDTO adto)
	{
		try
		{
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		ps=cn.prepareStatement(update_sql);
		ps.setString(1, adto.getBalance());
		ps.setString(2, adto.getAccno());
		ps.executeUpdate();
		cn.commit();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
	public void deleteData(AccountDTO adto)
	{
		try
		{
		ConnectionFactory con=new ConnectionFactory();
		cn=con.getConn();
		ps=cn.prepareStatement(delete_sql);
		ps.setString(1, adto.getAccno());
		ps.executeUpdate();
		cn.commit();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}
