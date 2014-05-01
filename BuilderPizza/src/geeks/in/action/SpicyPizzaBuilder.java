package geeks.in.action;

/**
 * Concrete pizza builder that builds Spicy pizza
 * 
 * @author manishdevraj
 * 
 */
public class SpicyPizzaBuilder implements PizzaBuilder {

	Pizza pizza;

	@Override
	public void buildBread() {
		pizza.setBread("pan baked");

	}

	@Override
	public void buildSauce() {
		pizza.setSauce("hot");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("pepperoni+salami");
	}

	@Override
	public Pizza getPizza() {
		return pizza;
	}

	@Override
	public void orderPizza() {
		this.pizza = new Pizza();
		buildBread();
		buildSauce();
		buildTopping();

	}
}