package com.example.abstractfactory.ways;

import com.example.factorymethod.ways.Ship;
import com.example.factorymethod.ways.ShipFactory;
import com.example.factorymethod.ways.WhiteShipFactory;

public class ShipInventory {

	public static void main(String[] args) {
		ShipFactory shipProFactory = new WhiteShipFactory(new WhitePartsProFactory());
		Ship shipPro = shipProFactory.createShip("WhiteProShip");
		System.out.println(shipPro.getAnchor().getClass());
		System.out.println(shipPro.getWheel().getClass());

		ShipFactory shipFactory = new WhiteShipFactory(new WhiteShipPartsFactory());
		Ship ship = shipFactory.createShip("WhiteShip");
		System.out.println(ship.getAnchor().getClass());
		System.out.println(ship.getWheel().getClass());
	}
}
