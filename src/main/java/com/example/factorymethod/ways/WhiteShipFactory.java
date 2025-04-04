package com.example.factorymethod.ways;

public class WhiteShipFactory implements ShipFactory {

	@Override
	public Ship createShip(String name) {
		return new WhiteShip(name);
	}
}
