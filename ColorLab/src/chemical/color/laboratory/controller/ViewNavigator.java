package chemical.color.laboratory.controller;


/**
 * Utility class for controlling navigation between vistas.
 *
 * All methods on the navigator are static to facilitate
 * simple access from anywhere in the application.
 */
public class ViewNavigator {

    /**
     * Convenience constants for fxml layouts managed by the navigator.
     */
	public static final String PAQ    	= "../view/";
    public static final String MAIN    	= PAQ + "main/MainView.fxml";
    public static final String LOGIN 	= PAQ + "login/LoginView.fxml";
    public static final String PRODUCTS = PAQ + "products/ProductsView.fxml";


}