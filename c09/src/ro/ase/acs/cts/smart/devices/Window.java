package ro.ase.acs.cts.smart.devices;

public class Window {
	protected boolean isClosed = true;
	
	public void close(){
		this.isClosed = true;
		System.out.println("Closed windows.");
	}
	
	public void open(){
		this.isClosed = false;
	}
}
