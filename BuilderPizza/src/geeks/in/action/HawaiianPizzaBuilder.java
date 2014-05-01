package geeks.in.action;

/**
 * Concrete builder that builds Hawaiian Pizza
 * 
 * @author manishdevraj
 * 
 */
public class HawaiianPizzaBuilder implements PizzaBuilder {
	Pizza pizza;

	@Override
	public void buildBread() {
		pizza.setBread("thik");

	}

	@Override
	public void buildSauce() {
		pizza.setSauce("mild");
	}

	@Override
	public void buildTopping() {
		pizza.setTopping("ham+pineapple");
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
