
public class Engine {
	
	private int horsePower;
	
	public Engine(final int horsePower) {
		this.horsePower = horsePower;
	}
	
	public int getHorsePower() {
		return horsePower;
	}
	
	@Override
	public String toString() {
		return "" + horsePower;
	}

}
