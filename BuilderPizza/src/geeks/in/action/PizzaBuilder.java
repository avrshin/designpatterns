package geeks.in.action;

/**
 * Pizza builder interface
 * 
 * @author manishdevraj
 * 
 */

public interface PizzaBuilder {
	public Pizza getPizza();

	public void buildBread();

	public void buildSauce();

	public void buildTopping();

	public void orderPizza();
}