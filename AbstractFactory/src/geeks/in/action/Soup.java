package geeks.in.action;

import java.util.ArrayList;
import java.util.ListIterator;

/**
 * Abstrace product to be created out of Factory
 * 
 * @author manishdevraj
 * 
 */
public abstract class Soup {
	ArrayList<String> soupIngredients = new ArrayList<String>();
	String soupName;

	public String getSoupName() {
		return soupName;
	}

	@Override
	public String toString() {
		StringBuffer stringOfIngredients = new StringBuffer(soupName);
		stringOfIngredients.append(" Ingredients: ");
		ListIterator<String> soupIterator = soupIngredients.listIterator();
		while (soupIterator.hasNext()) {
			stringOfIngredients.append(soupIterator.next()).append("\n");
		}
		return stringOfIngredients.toString();
	}
}
