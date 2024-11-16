
public class Driver {

	public void details(Vehicle vehicle) {
		System.out.println(vehicle.toString());
	}

	public static void main(String[] args) {
		
		Vehicle camry = new Car("Toyota", "Camry", 2020, 4);
		Vehicle accord = new Car("Honda", "Accord", 2021, 2);
		Vehicle f150 = new Vehicle("Ford", "F-150", 2022);
		Vehicle[] myRides = {camry, accord, f150};
		
		Driver driver = new Driver();
		for (int i = 0; i < myRides.length; i++) {
			driver.details(myRides[i]);
		}
	}
}
