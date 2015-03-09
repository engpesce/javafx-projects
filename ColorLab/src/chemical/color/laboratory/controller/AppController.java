package chemical.color.laboratory.controller;

import java.io.IOException;

import chemical.color.laboratory.controller.login.LoginViewController;
import chemical.color.laboratory.controller.main.MainController;
import chemical.color.laboratory.controller.products.ProductController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class AppController {
	
	protected Stage primaryStage;
	protected BorderPane rootLayout;

	public AppController(Stage primaryStage) {
		super();
		this.primaryStage = primaryStage;
	}

	public void startController() {
		initLoginView();
	}
	
	   /**
     * Initializes the root layout.
     */
    public void initLoginView() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(ViewNavigator.LOGIN));
            AnchorPane loginView = (AnchorPane) loader.load();

            // Give the controller access to the main app.
		   LoginViewController controller = loader.getController();
		   controller.setMainApp(this);
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(loginView);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void initMainView() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(ViewNavigator.MAIN));
            rootLayout = (BorderPane) loader.load();
            
            // Give the controller access to the main app.
 		    MainController controller = loader.getController();
 		    controller.setMainApp(this);
            
            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    

    public void selectView(String viewPath) {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource(viewPath));
            BorderPane productView = (BorderPane) loader.load();
            
            // Give the controller access to the main app.
 		    ProductController controller = loader.getController();
 		    controller.setMainApp(this);
            
            // Show the scene containing the root layout.
 		   rootLayout.setCenter(productView);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
