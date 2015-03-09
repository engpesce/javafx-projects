package chemical.color.laboratory.controller.products;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import chemical.color.laboratory.controller.AbstractController;
import chemical.color.laboratory.model.bo.Product;

public class ProductController extends AbstractController{

	@FXML
    private TableView<Product> productTable;
    @FXML
    private TableColumn<Product, String> codeColumn;
    @FXML
    private TableColumn<Product, String> descriptionColumn;
    @FXML
    private TableColumn<Product, String> unitColumn;
    @FXML
    private TableColumn<Product, String> measureColumn;
	
    /**
	 * The data as an observable list of Products.
	 */
	private ObservableList<Product> productData = FXCollections.observableArrayList();

    
    public ProductController() {
		super();
	}

    /**
     * Initializes the controller class. This method is automatically called
     * after the fxml file has been loaded.
     */
    @FXML
    private void initialize() {
		//init calling Service->Dao
    	Product p1 = new Product("001", "Color Rojo Intenso", "Litros", "Algo");
    	productData.add(p1);
    	productTable.setItems(productData);
	}
    
    /**
	 * Called when the user clicks on the delete button.
	 */
	@FXML
	private void handleDeleteProduct() {
//		int selectedIndex = productTable.getSelectionModel().getSelectedIndex();
//		if (selectedIndex >= 0) {
//			productTable.getItems().remove(selectedIndex);
//		} else {
//			// Nothing selected.
//			Dialogs.create()
//		        .title("Error")
//		        .masthead("Borrar sin seleccion")
//		        .message("No ha seleccionado ningun producto a borrar.")
//		        .showWarning();
//		}
	}
	
	/**
	 * Called when the user clicks the new button. Opens a dialog to edit
	 * details for a new person.
	 */
	@FXML
	private void handleNewProduct() {

	}

	/**
	 * Called when the user clicks the edit button. Opens a dialog to edit
	 * details for the selected person.
	 */
	@FXML
	private void handleEditProduct() {

	}

	/**
	 * Returns the data as an observable list of Persons.
	 * 
	 * @return
	 */
	public ObservableList<Product> getProductData() {
		return productData;
	}
}
