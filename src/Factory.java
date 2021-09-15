
public class Factory {
	
	public static Vehicle getVehicle(String vehicleType) {
		if (vehicleType.equalsIgnoreCase("car"))
			return new Car(new Engine(400));
		if (vehicleType.equalsIgnoreCase("truck"))
			return new Truck(new Engine(1200));
		else 
			return null;
	}

}
