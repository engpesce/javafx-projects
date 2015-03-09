package chemical.color.laboratory.model.service.impl;

import chemical.color.laboratory.model.bo.User;
import chemical.color.laboratory.model.dao.ILoginDao;
import chemical.color.laboratory.model.dao.impl.LoginDao;
import chemical.color.laboratory.model.error.handle.BusinessException;
import chemical.color.laboratory.model.error.handle.PersistenseException;
import chemical.color.laboratory.model.service.ILoginService;

public class LoginService implements ILoginService{
	//TODO inyectar con Spring
	protected ILoginDao loginDao;

	public LoginService() {
		loginDao = new LoginDao();
	}

	@Override
	public Boolean login(User userLogin) throws BusinessException{
		
		Boolean result = Boolean.FALSE;
		try {
			result = loginDao.login(userLogin);
		} catch (PersistenseException e) {
			//TODO pasarle a BusinessException el error de PersistenseException
			throw new BusinessException();
		}
		
		return result;
	}

	@Override
	public Boolean logout(User userLogout) throws BusinessException{
		
		Boolean result = Boolean.FALSE;
		try {
			result = loginDao.logout(userLogout);
		} catch (PersistenseException e) {
			//TODO pasarle a BusinessException el error de PersistenseException
			throw new BusinessException();
		}
		
		return result;
	}

}
