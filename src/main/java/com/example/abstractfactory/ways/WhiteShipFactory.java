package com.example.abstractfactory.ways;

import com.example.factorymethod.ways.DefaultShipFactory;
import com.example.factorymethod.ways.Ship;
import com.example.factorymethod.ways.WhiteShip;

public class WhiteShipFactory extends DefaultShipFactory {

	private ShipPartsFactory shipPartsFactory;

	@Override
	public Ship createShip(String name) {
		Ship ship = new WhiteShip(name);
		ship.setAnchor(shipPartsFactory.createAnchor());
		ship.setWheel(shipPartsFactory.createWheel());

		return ship;
	}

}
