
public class Truck implements Vehicle {
	
	private Engine engine;
	
	public Truck(final Engine engine) {
		this.engine = engine;
	}
	
	@Override
	public void startEngine() {
		System.out.println("Engine " + engine + " Has Started");
	}
	
	@Override
	public void turnOnLights() {
		System.out.println("Truck Lights Turned On");
	}
	
	@Override
	public void stopEngine() {
		System.out.println("Engine " + engine + " Has Stopped");
	}

}
