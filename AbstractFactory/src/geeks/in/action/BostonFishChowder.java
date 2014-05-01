package geeks.in.action;

import java.util.ArrayList;
import java.util.List;

public class BostonFishChowder extends FishChowder {
	private List<String> soupIngredients = new ArrayList<String>();

	public List<String> getSoupIngredients() {
		return soupIngredients;
	}

	public void setSoupIngredients(List<String> soupIngredients) {
		this.soupIngredients = soupIngredients;
	}

	public BostonFishChowder() {
		setSoupName("ScrodFishChowder");
		soupIngredients.clear();
		soupIngredients.add("1 Pound Fresh Scrod");
		soupIngredients.add("1 cup corn");
		soupIngredients.add("1/2 cup heavy cream");
		soupIngredients.add("1/4 cup butter");
		soupIngredients.add("1/4 cup potato chips");
	}

}
