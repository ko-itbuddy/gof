package com.example.factorymethod.ways;

import com.example.abstractfactory.ways.ShipPartsFactory;

public class WhiteShipFactory implements ShipFactory {

	private ShipPartsFactory shipPartsFactory;

	public WhiteShipFactory(ShipPartsFactory shipPartsFactory) {
		this.shipPartsFactory = shipPartsFactory;
	}

	@Override
	public Ship createShip(String name) {
		Ship ship = new WhiteShip(name);
		ship.setAnchor(shipPartsFactory.createAnchor());
		ship.setWheel(shipPartsFactory.createWheel());

		return ship;
	}
}
