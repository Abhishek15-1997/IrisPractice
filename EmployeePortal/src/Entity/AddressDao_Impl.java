package Entity;

import java.sql.Connection;
import java.sql.PreparedStatement;

import DataAccessObject.AddressDao;
import GetConnection.ConnectionProvider;
import jdk.nashorn.internal.ir.RuntimeNode.Request;

public class AddressDao_Impl implements AddressDao {

	@Override
	public boolean addAddress(Address obj) {
		PreparedStatement ps;
		
		try(Connection con=(Connection)ConnectionProvider.getdbCon();)
		{
			ps=con.prepareStatement("insert into Address values(?,?,?,?,?,?)");
			ps.setInt(1, obj.getEmpid());
			ps.setString(2,obj.getCity());
			ps.setInt(3,obj.getHouseNo());
			ps.setString(4, obj.getLocality());
			ps.setInt(5, obj.getPinCode());
			ps.setString(6, obj.getState());
			
			int p=ps.executeUpdate();
			if(p!=0)
			{
				System.out.println("Inside addAddress");
				return true;
			}	
						
		}
		
		catch(Exception e)
		{System.out.println(e);}
		return false;
	}

	@Override
	public boolean UpdateAddress(Address obj) {
		
		return false;
	}

	@Override
	public Address getAddressByEmployee(int eid) {
		
		return null;
	}

}
