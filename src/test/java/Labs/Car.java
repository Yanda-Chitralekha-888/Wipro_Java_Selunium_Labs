package Labs;

interface Vehicle {
	void start();

	void stop();
}

public class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("Car is starting...");
	}

	@Override
	public void stop() {
		System.out.println("Car is stopping...");
	}

	public static void main(String[] args) {
		Car myCar = new Car();
		myCar.start();
		myCar.stop();
	}
}