package problem2.test;

import problem2.vehicles.Vehicle;
import problem2.vehicles.VehicleFactory;

public class App {
	public static void main(String[] args) {
		String[] vehicleNames = {"Bus", "Truck", "Car", "ElectricCar","Van"};
		
		for (int i = 0; i < vehicleNames.length; i++) {
				Vehicle vehicle = VehicleFactory.getVehicle(vehicleNames[i]);
				if(vehicle!=null)
				   vehicle.startEngine();
			}
	}
}
