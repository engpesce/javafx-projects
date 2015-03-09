package chemical.color.laboratory.controller.main;

import java.util.Date;

import org.controlsfx.dialog.Dialogs;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import chemical.color.laboratory.controller.AbstractController;
import chemical.color.laboratory.controller.ViewNavigator;

public class MainController extends AbstractController{

	@FXML
	public Label statusBarUser;
	@FXML
	public Label statusBarDate;
	@FXML
	public Label statusBarStatus;
	

    public MainController() {
    	super();
	}
    
    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
    	statusBarUser.setText("Admin");
    	statusBarDate.setText(String.valueOf(new Date()));
    	statusBarStatus.setText("OK");
    	
    }
    
	@FXML public void reset(){
		
	}
	
	@FXML public void selectedProductMenu(){
		main.selectView(ViewNavigator.PRODUCTS);
	}
	
	@FXML public void selectedHomeMenu(){
	}
	
	@FXML public void selectedLogoutMenu(){
		main.selectView(ViewNavigator.LOGIN);
	}
	
	@FXML public void selectedExitMenu(){
		System.exit(0);
	}
	
	@FXML public void selectedAboutMenu(){
		Dialogs.create()
	    .title("ColorLab")
	    .masthead("About")
	    .message("Secction to complete...")
	    .showInformation();
	}
    
}
