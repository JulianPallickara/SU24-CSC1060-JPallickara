
public class Vehicle {
	public int year;
	public String model;
	public String make;
	
	public Vehicle() {
		this.make = "Toyota";
		this.model = "Camry";
		this.year = 2020;
	}

	public  Vehicle(String make, String model, int year) {
		
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		
	
}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	@Override
	public String toString() {
		return "Vehicle [year=" + year + ", model=" + model + ", make=" + make + "] \n";
	}
	
	
}