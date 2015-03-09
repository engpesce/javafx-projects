package chemical.color.laboratory.model.dao;

import chemical.color.laboratory.model.bo.User;
import chemical.color.laboratory.model.error.handle.PersistenseException;

public interface ILoginDao {
	
	public Boolean login(User userLogin) throws PersistenseException;
	public Boolean logout(User userLogout) throws PersistenseException;

}
