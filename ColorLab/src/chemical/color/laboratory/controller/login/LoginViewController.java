package chemical.color.laboratory.controller.login;

import chemical.color.laboratory.controller.AbstractController;
import chemical.color.laboratory.controller.AppController;
import chemical.color.laboratory.controller.MainApp;
import chemical.color.laboratory.model.bo.User;
import chemical.color.laboratory.model.error.handle.BusinessException;
import chemical.color.laboratory.model.service.ILoginService;
import chemical.color.laboratory.model.service.impl.LoginService;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class LoginViewController extends AbstractController{
	
	@FXML
	public TextField user;
	@FXML
	public TextField password;
	@FXML
	public Label errorMessage;
	
	ILoginService loginService;
	
	
	public LoginViewController() {
		super();
		this.loginService = new LoginService();
	}

	//TODO create an interface for this
	@FXML public void login(){
		
		User userForLogin = new  User(this.user.getText(), this.password.getText());
		Boolean result = false;
		try {
			result =  loginService.login(userForLogin);
		} catch (BusinessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (result){
			errorMessage.setText("Bienvenido " + userForLogin.getName() + "!");
			main.initMainView();
		}else{
			errorMessage.setText("Usuario o Password Incorrecto");
		}
	
	}
	
	@FXML public void reset(){
		user.setText(null);
		password.setText(null);
		errorMessage.setText(null);
	}


	
}
