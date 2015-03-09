package chemical.color.laboratory.controller;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.layout.BorderPane;

public class AbstractController {
	
	//TODO inject this properties
	protected AppController main;
	
	/** container of a switchable vista. */
    @FXML
    private BorderPane container;
    
    
	/**
     * Replaces the vista displayed in the vista holder with a new vista.
     *
     * @param node the vista node to be swapped in.
     */
    public void setView(Node node) {
    	container.getChildren().setAll(node);
    }
    
	public void setMainApp(AppController main){
		this.main = main;
	}

}
