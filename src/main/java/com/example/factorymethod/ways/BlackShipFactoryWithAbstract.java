package com.example.factorymethod.ways;

public class BlackShipFactoryWithAbstract extends DefaultShipFactory {

	@Override
	public Ship createShip(String name) {
		return new BlackShip(name);
	}

}
