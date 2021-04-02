package lab7;

import java.util.ArrayList;

public class Main {
	
	private void findPath(City cityA, City cityB, Road[] roads) {
		
	}

	public static void main(String[] args) {
		City Izhevsk = new City("Izhevsk");
		City Samara = new City("Samara");
		City Moskow = new City("Moskow");
		City SaintPetersburg = new City("SaintPetersburg");
		City Volgograd = new City("Volgograd");
		City Voronezh = new City("Voronezh");
		City Ekaterinburg = new City("Ekaterinburg");
		
		
		ArrayList<Road> roads = new ArrayList<Road>();

		roads.add(new Road(Izhevsk, Samara));
		roads.add(new Road(Izhevsk, Ekaterinburg));
		roads.add(new Road(Izhevsk, Volgograd));
		roads.add(new Road(Izhevsk, Voronezh));
		roads.add(new Road(Samara, Ekaterinburg));
		roads.add(new Road(Samara, Moskow));
		roads.add(new Road(Samara, SaintPetersburg));
		roads.add(new Road(Voronezh, SaintPetersburg));
		roads.add(new Road(Voronezh, Volgograd));

		
		System.out.println(road);
	}
	
}
