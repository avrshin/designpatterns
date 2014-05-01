package geeks.in.action;

import java.util.Calendar;

/**
 * Test Abstract Soup Factory
 * 
 * @author manishdevraj
 * 
 */
public class TestAbstractSoupFactory {
	public static Soup MakeSoupOfTheDay(AbstractSoupFactory concreteSoupFactory) {
		Calendar todayCalendar = Calendar.getInstance();
		int dayOfWeek = todayCalendar.get(Calendar.DAY_OF_WEEK);
		if (dayOfWeek == Calendar.MONDAY) {
			return concreteSoupFactory.makeClamChowder();
		} else if (dayOfWeek == Calendar.TUESDAY) {
			return concreteSoupFactory.makeChickenSoup();
		} else if (dayOfWeek == Calendar.WEDNESDAY) {
			return concreteSoupFactory.makeFishChowder();
		} else if (dayOfWeek == Calendar.THURSDAY) {
			return concreteSoupFactory.makeTofuSoup();
		} else if (dayOfWeek == Calendar.FRIDAY) {
			return concreteSoupFactory.makeVegetableSoup();
		} else if (dayOfWeek == Calendar.SATURDAY) {
			return concreteSoupFactory.makeTofuSoup();
		} else {
			return concreteSoupFactory.makeClamChowder();
		}
	}

	public static void main(String[] args) {
		AbstractSoupFactory concreteSoupFactory = new BostonConcreteSoupFactory();
		Soup soupOfTheDay = MakeSoupOfTheDay(concreteSoupFactory);
		System.out.println("The Soup of the day "
				+ concreteSoupFactory.getFactoryLocation() + " is "
				+ soupOfTheDay.getSoupName());

		System.out.println("The Soup ingredients : " + soupOfTheDay.toString());

		concreteSoupFactory = new NewYorkConcreteSoupFactory();
		soupOfTheDay = MakeSoupOfTheDay(concreteSoupFactory);
		System.out.println("The Soup of the day "
				+ concreteSoupFactory.getFactoryLocation() + " is "
				+ soupOfTheDay.getSoupName());

		System.out.println("The Soup ingredients : " + soupOfTheDay.toString());

	}
}