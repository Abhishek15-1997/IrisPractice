package DataAccessObject;
import Entity.EmployeeDetails;
public interface EmployeeDao {
	
	public EmployeeDetails validate(int x,String y);
	public boolean register(String fname,String lname,String gender,String ph_no,int age,String pass);
	public boolean update(int empid,String fname,String lname,String gender,String ph_no,int age,String pass);
	public boolean delete(int id);
	
}
