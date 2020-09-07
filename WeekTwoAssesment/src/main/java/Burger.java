
public class Burger {
	private String toppings;
	private String type;
	private int layers;
	
	public String getToppings() {
		return toppings;
	}
	public void setToppings(String toppings) {
		this.toppings = toppings;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getLayers() {
		return layers;
	}
	public void setLayers(int layers) {
		this.layers = layers;
	}
	
	public Burger() {
		
	}
	
	public Burger(String type) {
		this.setType(type);
	}
	
	public String returnBugerType(Burger burger) {
		return this.type;
	}
	
	public String returnBugerToppings(Burger burger) {
		return this.toppings;
	}
	
	public int returnBugerLayers(Burger burger) {
		return this.layers;
	}
}
