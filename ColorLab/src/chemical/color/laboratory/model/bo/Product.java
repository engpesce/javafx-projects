package chemical.color.laboratory.model.bo;

import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 * Model class for a Person.
 *
 * @author Marco Jakob
 */
public class Product {

	private StringProperty productGroup;
	private StringProperty cod;
	private StringProperty description;
	private StringProperty supplier;
	private StringProperty recipeOrder;
	private StringProperty currentStock;
	private StringProperty minStock;
	private StringProperty replaceStock;
	private StringProperty unitMeasure;
	private StringProperty factor;
	private StringProperty sign;
	private FloatProperty cost;
	private StringProperty currency;
	
	public Product() {
	}

	public Product(String cod, String description,
			String unitMeasure, String factor) {
		super();
		this.cod = new SimpleStringProperty(cod);
		this.description = new SimpleStringProperty(description);
		this.unitMeasure = new SimpleStringProperty(unitMeasure);
		this.factor = new SimpleStringProperty(factor);
	}


	public StringProperty getProductGroup() {
		return productGroup;
	}

	public void setProductGroup(StringProperty productGroup) {
		this.productGroup = productGroup;
	}

	public StringProperty getCod() {
		return cod;
	}

	public void setCod(StringProperty cod) {
		this.cod = cod;
	}

	public StringProperty getDescription() {
		return description;
	}

	public void setDescription(StringProperty description) {
		this.description = description;
	}

	public StringProperty getSupplier() {
		return supplier;
	}

	public void setSupplier(StringProperty supplier) {
		this.supplier = supplier;
	}

	public StringProperty getRecipeOrder() {
		return recipeOrder;
	}

	public void setRecipeOrder(StringProperty recipeOrder) {
		this.recipeOrder = recipeOrder;
	}

	public StringProperty getCurrentStock() {
		return currentStock;
	}

	public void setCurrentStock(StringProperty currentStock) {
		this.currentStock = currentStock;
	}

	public StringProperty getMinStock() {
		return minStock;
	}

	public void setMinStock(StringProperty minStock) {
		this.minStock = minStock;
	}

	public StringProperty getReplaceStock() {
		return replaceStock;
	}

	public void setReplaceStock(StringProperty replaceStock) {
		this.replaceStock = replaceStock;
	}

	public StringProperty getUnitMeasure() {
		return unitMeasure;
	}

	public void setUnitMeasure(StringProperty unitMeasure) {
		this.unitMeasure = unitMeasure;
	}

	public StringProperty getFactor() {
		return factor;
	}

	public void setFactor(StringProperty factor) {
		this.factor = factor;
	}

	public StringProperty getSign() {
		return sign;
	}

	public void setSign(StringProperty sign) {
		this.sign = sign;
	}

	public FloatProperty getCost() {
		return cost;
	}

	public void setCost(FloatProperty cost) {
		this.cost = cost;
	}

	public StringProperty getCurrency() {
		return currency;
	}

	public void setCurrency(StringProperty currency) {
		this.currency = currency;
	}

}