
public class Start {
	
	public static void main(String[] args) {
		
		Car car = (Car) Factory.getVehicle("car");
		Truck truck = (Truck) Factory.getVehicle("truck");
		
		car.startEngine();
		truck.startEngine();
	}

}
