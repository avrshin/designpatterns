package geeks.in.action;

/**
 * Customer ordering a pizza
 * 
 * @author manishdevraj
 * 
 */
public class PizzaOrder {
	public static void main(String[] args) {
		Waiter waiter = new Waiter();
		PizzaBuilder hawaiianPizzaBuilder = new HawaiianPizzaBuilder();
		PizzaBuilder spicyPizzaBuilder = new SpicyPizzaBuilder();
		// 1st
		waiter.setPizzaBuilder(hawaiianPizzaBuilder);
		waiter.constructPizza();
		Pizza pizza = waiter.getPizza();
		System.out.println("Making Hawaian 1st Pizza " + pizza.getBread()
				+ " : " + pizza.getSauce() + " : " + pizza.getTopping());
		// 2nd
		waiter.setPizzaBuilder(spicyPizzaBuilder);
		waiter.constructPizza();
		pizza = waiter.getPizza();
		System.out.println("2nd Pizza " + pizza.getBread() + " : "
				+ pizza.getSauce() + " : " + pizza.getTopping());
	}
}