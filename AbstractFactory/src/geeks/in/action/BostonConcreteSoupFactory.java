package geeks.in.action;

/**
 * Boston Concrete Soup Factory
 * 
 * @author manishdevraj
 * 
 */
public class BostonConcreteSoupFactory extends AbstractSoupFactory {

	public BostonConcreteSoupFactory() {
		factoryLocation = "Boston";
	}

	@Override
	public ChickenSoup makeChickenSoup() {
		return new ChickenSoup();
	}

	@Override
	public BostonTofuSoup makeTofuSoup() {
		return new BostonTofuSoup();
	}

	@Override
	public BostonVegetableSoup makeVegetableSoup() {
		return new BostonVegetableSoup();
	}

	@Override
	public ClamChowder makeClamChowder() {
		return new BostonClamChowder();
	}

	@Override
	public FishChowder makeFishChowder() {
		return new BostonFishChowder();
	}
}