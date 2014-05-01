package geeks.in.action;

/**
 * API director that controls builder and pizza making process
 * 
 * @author manishdevraj
 * 
 */
class Waiter {
	private PizzaBuilder pizzaBuilder;

	public void setPizzaBuilder(PizzaBuilder pb) {
		pizzaBuilder = pb;
	}

	public Pizza getPizza() {
		return pizzaBuilder.getPizza();
	}

	public void constructPizza() {
		pizzaBuilder.orderPizza();
		pizzaBuilder.buildBread();
		pizzaBuilder.buildSauce();
		pizzaBuilder.buildTopping();
	}
}