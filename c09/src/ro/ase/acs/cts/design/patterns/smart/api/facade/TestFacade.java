package ro.ase.acs.cts.design.patterns.smart.api.facade;

import ro.ase.acs.cts.smart.devices.EntryDoor;
import ro.ase.acs.cts.smart.devices.WashingMachine;
import ro.ase.acs.cts.smart.devices.WaterFaucet;
import ro.ase.acs.cts.smart.devices.Window;

public class TestFacade {

	public static void main(String[] args) {
		
		
//		Window kitchenWindow = new Window();
//		WaterFaucet tapWaterFaucet = new WaterFaucet();
//		EntryDoor apartmentDoor = new EntryDoor();
//		WashingMachine washingMachine = new WashingMachine();
//
//		//close the apartment
//		kitchenWindow.close();
//		tapWaterFaucet.close();
//		apartmentDoor.close();
//		washingMachine.stop();
//
//		//start washing machine
//		tapWaterFaucet.open();
//		washingMachine.start();

		//instead of calling all classes manually, map them via 1 facade class
		ApartmentAPIFacade apartment = new ApartmentAPIFacade(
				new Window(),
				new WaterFaucet(),
				new EntryDoor(),
				new WashingMachine());

		//1 single call for the created object via facade, calls multiple classes actions
		apartment.lock();
		//later ...
		apartment.startWashingMachine();

	}

}
