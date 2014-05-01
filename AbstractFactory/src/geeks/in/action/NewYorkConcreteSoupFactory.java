package geeks.in.action;

/**
 * Another concrete soup factory implemenatation
 * 
 * @author manishdevraj
 * 
 */
public class NewYorkConcreteSoupFactory extends AbstractSoupFactory {
	public NewYorkConcreteSoupFactory() {
		factoryLocation = "New York";
	}

	@Override
	public ClamChowder makeClamChowder() {
		return new NewYorkClamChowder();
	}

	@Override
	public FishChowder makeFishChowder() {
		return new NewYorkFishChowder();
	}

	@Override
	public ChickenSoup makeChickenSoup() {
		return new ChickenSoup();
	}
}
