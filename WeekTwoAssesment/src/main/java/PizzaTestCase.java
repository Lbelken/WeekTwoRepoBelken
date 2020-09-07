import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Before;

public class PizzaTestCase {
	Pizza pizza = new Pizza();
	
	@Before
	public void setUp() throws Exception {
		
	}
	@Test
	public void testType() {
		pizza.setType("Pepperoni");
		String returnedType = pizza.returnPizzaType(pizza);
		returnedType.equals("Pepperoni");
	}
	@Test
	public void testToppings() {
		pizza.setToppings("Pepperoni, Cheese");
		String returnedToppings = pizza.returnPizzaToppings(pizza);
		returnedToppings.equals("Pepperoni, Cheese");
	}
	@Test
	public void testSize() {
		pizza.setSize("Large");
		String returnedSize = pizza.returnPizzaSize(pizza);
		assertFalse(returnedSize.equals("Small"));
	}

}
