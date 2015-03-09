package chemical.color.laboratory.model.dao.impl;

import chemical.color.laboratory.model.bo.User;
import chemical.color.laboratory.model.dao.ILoginDao;
import chemical.color.laboratory.model.error.handle.BusinessException;
import chemical.color.laboratory.model.error.handle.PersistenseException;

public class LoginDao implements ILoginDao{

	@Override
	public Boolean login(User userLogin) throws PersistenseException {
		
		Boolean isValidUser = Boolean.FALSE;
		
		if ( userLogin.getName() != null &&
			 userLogin.getName().equals("admin") &&
			 userLogin.getPassword() != null &&
			 userLogin.getPassword().equals("admin") ){
			
			isValidUser = Boolean.TRUE;
		}
		
		return isValidUser;
	}

	@Override
	public Boolean logout(User userLogout) throws PersistenseException {
		//TODO implementar sacarlo de la session!
		return null;
	}

	
}
