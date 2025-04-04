package com.example.factorymethod.ex;

import com.example.factorymethod.ways.BlackShip;
import com.example.factorymethod.ways.WhiteShip;

public class SimpleFactory {
	public Object createShip(String name) {
		if (name.equals("white")) {
			return new WhiteShip(name);
		} else if (name.equals("black")) {
			return new BlackShip(name);
		}

		throw new IllegalArgumentException("Unknown ship type: " + name);
	}
}
