
public interface IOrderLogging {
	
	// Returns the number of orders managed by the class that implements this interface
	public int getNoOfOrders();
	
	// Prints a message to the console with the name of the ordered drink
	// Increments the number of orders
	public void logNewOrder(String drinkType);
	
	// Prints a message to the console with the name of the canceled drink
	// Decrement the number of orders
	public void logCancelOrder(String drinkType);
	
}
