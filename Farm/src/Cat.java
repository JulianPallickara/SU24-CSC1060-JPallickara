
public class Cat extends Animal{
	private String color;
	
	public Cat(double height, double weight, String name, String color) {
		super(height, weight, name);
		this.color = color;
	}
	
	Cat cat = new Cat(10.0,12.0,"kiyyy", "Gray");
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public String makeSound();
		return ("Meow!");
}
	@Override
	public String toString() {
		return super.toString() + "/n Color";
	}

}}