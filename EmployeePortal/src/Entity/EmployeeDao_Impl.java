package Entity;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.http.HttpSession;

import DataAccessObject.EmployeeDao;
import GetConnection.ConnectionProvider; 
public class EmployeeDao_Impl implements EmployeeDao{

	PreparedStatement ps;
	@Override
	public EmployeeDetails validate(int empid,String password) {

		try
		{
			Connection con=ConnectionProvider.getdbCon();
			System.out.println("connection");
			PreparedStatement ps=con.prepareStatement("select * from employee2 natural join login where empid=? and password=?");
			
			ps.setInt(1,empid);
			ps.setString(2, password);
			EmployeeDetails emp=null;
			ResultSet rs=ps.executeQuery();
			System.out.println();
			if(rs.next())
			{
				emp=new EmployeeDetails();
				
				emp.setF_name(rs.getString(2));
				emp.setEmpid(rs.getInt(1));
				
				emp.setAge(rs.getInt(4));
				emp.setL_name(rs.getString(3));
				emp.setGender(rs.getString(5));
				emp.setPhoneNo(rs.getString(6));
				
				emp.setRole(rs.getString(8));
				emp.setPass(rs.getString(7));
				
			
				
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));			
				return emp;
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
			return null;
		
			
	}

	@Override
	public boolean register(String fname,String lname,String gender,String ph_no,int age,String pass) {
		
		PreparedStatement ps;
		try
		{
			Connection con=ConnectionProvider.getdbCon();
			System.out.println("connection");
			ps=con.prepareStatement("insert into Employee2 values(empid.nextVal,?,?,?,?,?)");
			
			ps.setString(1,fname);
			ps.setString(2, lname);
			ps.setInt(3, age);
			ps.setString(4, gender);
			ps.setString(5, ph_no);
			
			int p=ps.executeUpdate();
			if(p!=0)
			{
				System.out.println("1 row inserted");
				ps=con.prepareStatement("insert into LogIn values(empid.currVal,?,'Employee')");
				ps.setString(1,pass);
				ps.executeUpdate();			
			}	
			return true;			
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		return false;
	}

	@Override
	public boolean update(int empid,String fname,String lname,String gender,String ph_no,int age,String pass)
	{
		boolean flag=false;
		try(Connection con=ConnectionProvider.getdbCon();) {
			
			System.out.println("connection");
			
			ps=con.prepareStatement("update employee2 set emp_fname=?, emp_lname=?, emp_age=?, emp_gender=?, emp_phoneno=? where empid=?");
			
						
			ps.setString(1,fname);
			ps.setString(2, lname);
			ps.setInt(3, age);
			ps.setString(4,gender);
			ps.setString(5, ph_no);
			ps.setInt(6,empid);
					
			int p=ps.executeUpdate();
			System.out.println("gottttchaaaa");
			ps=con.prepareStatement("update LogIn set PASSWORD=? where empid=?");
			
			ps.setString(1,pass );
			ps.setInt(2, empid);
			int j=ps.executeUpdate();
					
			if(p!=0 && j!=0 )
			{
				flag=true;
				
				return flag;}
			
			}
			catch(Exception e1)
			{System.out.println(e1);}
			
			return flag;
		}
		
	

	@Override
	public boolean delete(int id) {
		try {
		Connection con=ConnectionProvider.getdbCon();
		System.out.println("connection");
		ps=con.prepareStatement("delete from login where empid=?");
		ps.setInt(1, id);
		int i=ps.executeUpdate();
		
		ps=con.prepareStatement("delete from employee2 where empid=?");
		ps.setInt(1, id);
		int j=ps.executeUpdate();
		
		if(i!=0 && j!=0)
			return true;
		
		}
		catch(Exception e)
		{System.out.println(e);}
		
		return false;
	}
	

}
