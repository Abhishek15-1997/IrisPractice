package Entity;

import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionBindingListener;

@WebListener
public class EmployeeDetails implements HttpSessionBindingListener {
	
	private int empid;
	private String f_name;
	private String l_name;
	private int age;
	private String gender;
	private String phoneNo;
	private String Role;
	private String pass;
	private Address addr;
	
	public Address getAddr() {
		return addr;
	}
	public void setAddr(Address addr) {
		this.addr = addr;
	}
	public int getEmpid() {
		return empid;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getF_name() {
		return f_name;
	}
	public void setF_name(String f_name) {
		this.f_name = f_name;
	}
	public String getL_name() {
		return l_name;
	}
	public void setL_name(String l_name) {
		this.l_name = l_name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getRole() {
		return Role;
	}
	public void setRole(String role) {
		Role = role;
	}
	@Override
	public void valueBound(HttpSessionBindingEvent event1) {
		EmployeeDetails emp=(EmployeeDetails)event1.getValue(); //when employee object is added
		System.out.println("..........."+event1.getName());
		String phoneNo=emp.getPhoneNo();
		if(phoneNo.startsWith("+91"))
			emp.setPhoneNo("+91"+phoneNo);
	}
	@Override
	public void valueUnbound(HttpSessionBindingEvent event2) {
		
		
	}
	
	

}
