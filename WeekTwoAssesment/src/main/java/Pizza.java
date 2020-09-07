
public class Pizza {
	private String toppings;
	private String size;
	private String type;
	
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public Pizza() {
		
	}
	
	public Pizza(String type) {
		this.setType(type);
	}
	
	public String returnPizzaType(Pizza pizza) {
		return this.type;
	}
	
	public String returnPizzaToppings(Pizza pizza) {
		return this.toppings;
	}
	
	public String returnPizzaSize(Pizza pizza) {
		return this.size;
	}
}
