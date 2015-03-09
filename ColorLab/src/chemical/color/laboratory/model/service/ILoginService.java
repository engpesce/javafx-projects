package chemical.color.laboratory.model.service;

import chemical.color.laboratory.model.bo.User;
import chemical.color.laboratory.model.error.handle.BusinessException;

public interface ILoginService {
	
	public Boolean login(User userLogin) throws BusinessException;
	public Boolean logout(User userLogout) throws BusinessException;

}
