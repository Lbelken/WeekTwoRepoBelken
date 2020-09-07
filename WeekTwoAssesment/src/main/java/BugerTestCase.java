import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class BugerTestCase {
	Burger burger = new Burger();
	
	@Before
	public void setUp() throws Exception {
		
	}
	@Test
	public void testType() {
		burger.setType("Cheese Burger");
		String returnedType = burger.returnBugerType(burger);
		returnedType.equals("Cheese Burger");
	}
	@Test
	public void testToppings() {
		burger.setToppings("Cheese, Ketchup, Pickles, Onion, Lettuce");
		String returnedToppings = burger.returnBugerToppings(burger);
		assertNotNull(returnedToppings);
	}
	@Test
	public void testLayers() {
		burger.setLayers(1);
		int returnedLayers = burger.returnBugerLayers(burger);
		assertTrue(returnedLayers == 1);
	}

}
