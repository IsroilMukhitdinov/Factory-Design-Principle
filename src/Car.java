
public class Car implements Vehicle {
	
	private Engine engine;
	
	public Car(final Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public void startEngine() {
		System.out.println("Engine " + engine + " Has Started");
	}
	
	@Override
	public void turnOnLights() {
		System.out.println("Car Lights Turned On");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("Engine " + engine + " Has Stopped");
	}

}
