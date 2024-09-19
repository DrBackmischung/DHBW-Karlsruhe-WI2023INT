package builder;

import builder.house.House;
import builder.house.HouseBuilder;

public class Main {
	
	public static void main(String[] args) {
		House simpleHouse = new HouseBuilder(3)
                .setWindows(10)
                .setDoors(5)
                .build();

        System.out.println(simpleHouse);

        House luxuryHouse = new HouseBuilder(5)
                .setWindows(20)
                .setDoors(8)
                .setGarage(true)
                .setSwimmingPool(true)
                .setGarden(true)
                .build();

        System.out.println(luxuryHouse);
	}

}
