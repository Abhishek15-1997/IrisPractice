package DataAccessObject;

import Entity.Address;

public interface AddressDao {
	public boolean addAddress(Address obj);
	public boolean UpdateAddress(Address obj);
	public Address getAddressByEmployee(int eid); 

}
