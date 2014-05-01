package geeks.in.action;

/**
 * Abstract Soup Factory implementation
 * 
 * @author manishdevraj
 * 
 */
public abstract class AbstractSoupFactory {
	String factoryLocation;

	public String getFactoryLocation() {
		return factoryLocation;
	}

	public ChickenSoup makeChickenSoup() {
		return new ChickenSoup();
	}

	public BostonTofuSoup makeTofuSoup() {
		return new BostonTofuSoup();
	}

	public BostonVegetableSoup makeVegetableSoup() {
		return new BostonVegetableSoup();
	}

	public ClamChowder makeClamChowder() {
		return new ClamChowder();
	}

	public FishChowder makeFishChowder() {
		return new FishChowder();
	}

}