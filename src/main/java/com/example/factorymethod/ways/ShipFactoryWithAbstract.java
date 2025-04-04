package com.example.factorymethod.ways;

public interface ShipFactoryWithAbstract {

	default Ship orderShip(String name, String email) {
		validate(name, email);

		prepareFor(name);

		Ship ship = createShip(name);

		sendEmailTo(email);

		return ship;
	}

	Ship createShip(String name);

	void validate(String name, String email);

	void prepareFor(String name);

	void sendEmailTo(String email);

}
