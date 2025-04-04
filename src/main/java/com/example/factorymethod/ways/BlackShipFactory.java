package com.example.factorymethod.ways;

public class BlackShipFactory implements ShipFactory {

	@Override
	public Ship createShip(String name) {
		return new BlackShip(name);
	}

}
