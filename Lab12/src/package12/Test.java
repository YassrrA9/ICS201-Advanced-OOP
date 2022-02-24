package package12;

import java.util.*;

public class Test {
	public static void main(String[] args) {
		
		ArrayList<City> Cities = new ArrayList<City>();
		City C1 = new City("Mecca",39);
		City C2 = new City("Dhahran",29);
		City C3 = new City("Khobar",30);
		City C4 = new City("Istanbul",20);
		City C5 = new City("Riyadh",32);
		City C6 = new City("Tokyo",14);
		Cities.add(C1);
		Cities.add(C2);
		Cities.add(C3);
		Cities.add(C4);
		Cities.add(C5);
		Cities.add(C6);
		Cities.sort(null);
		System.out.println("Cities from Lowest Temperature to Highest\n");
		for(int i=0; i<Cities.size();i++) {
			System.out.println(Cities.get(i));
		}
		

	}
}
