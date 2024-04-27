package problem2.vehicles;

public class VehicleFactory {
	// Keep constructor private
	private VehicleFactory() {
	}

	public static Vehicle getVehicle(String vehicleName) {
		vehicleName = vehicleName.toLowerCase();

		switch (vehicleName) {
		case "bus":
			return new Bus();
		case "truck":
			return new Truck();
		case "car":
			return new Car();
		case "electriccar":
			return new ElectricCar();
		default: {
			System.out.println("Unknown Product");
			return null;
		}
		}

	}
}
