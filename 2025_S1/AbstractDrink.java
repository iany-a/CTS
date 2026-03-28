
public abstract class AbstractDrink {
	
	String name;
	
	protected AbstractDrink(String name) {
		this.name = name;
	}

	// Returns a description of the drink characteristics
	public abstract void getDrinkDescription();
	
	// Returns the number of sugar spoons
	public abstract int getNoOfSugarSpoons();
	
	// Returns the toppings
	public abstract String getToppings();
}
