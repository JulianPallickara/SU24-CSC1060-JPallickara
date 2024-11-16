
public class Dog
extend Kitty
{
	public Dog(double height2, double weight2, String name2) {
		// TODO Auto-generated constructor stub
	}
		super();
		this.height = height;
		this.weight = weight;
		this.name = name;
		this.cuteness = cuteness;
		this.breed = breed;
	
	}

	public int getCuteness() {
		return cuteness;
	}

	public void setCuteness(int cuteness) {
		this.cuteness = cuteness;
	}

	private double height;
	private double weight;
	private String name;
	private String breed;
	{
		{
			super();
			this.height = null;
			this.weight = 0;
			this.name = 0;
			this.cuteness = 0;

		}

	}
}
