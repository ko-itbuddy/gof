package com.example.abstractfactory.ways;

public class WhiteShipPartsFactory implements ShipPartsFactory {
	@Override
	public Anchor createAnchor() {
		return new WhiteAnchor();
	}

	@Override
	public Wheel createWheel() {
		return new WhiteWheel();
	}

}
