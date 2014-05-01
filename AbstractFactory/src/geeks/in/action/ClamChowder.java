package geeks.in.action;

import java.util.ListIterator;

public class ClamChowder extends Soup {

	@Override
	public String getSoupName() {
		return soupName;
	}

	protected void setSoupName(String newSoupName) {
		this.soupName = newSoupName;

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
