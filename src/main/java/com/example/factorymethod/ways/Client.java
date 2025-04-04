package com.example.factorymethod.ways;

public class Client {

	public static void main(String[] args) {
		Client client = new Client();

		Ship whiteShip = ShipFactoryNotFactoryMethod.orderShip("whiteShip", "ko.itbuddy.gmail.com");
		System.out.println(whiteShip);
		Ship blackShip = ShipFactoryNotFactoryMethod.orderShip("blackShip", "ko.itbuddy.gmail.com");
		System.out.println(blackShip);

		Ship whiteShip2 = new WhiteShipFactory().orderShip("whiteShip", "ko.itbuddy.gmail.com");
		System.out.println(whiteShip2);
		Ship blackShip2 = new BlackShipFactory().orderShip("blackShip", "ko.itbuddy.gmail.com");
		System.out.println(blackShip2);

		client.print(new WhiteShipFactory(), "whiteShip", "ko.itbuddy.gmail.com");
		client.print(new BlackShipFactory(), "blackShip", "ko.itbuddy.gmail.com");
		client.print(new BlackShipFactoryWithAbstract(), "blackShip", "ko.itbuddy.gmail.com");
	}

	private void print(ShipFactory whiteShipFactory, String shipName, String orderEmail) {
		System.out.println(whiteShipFactory.orderShip(shipName, orderEmail));
	}
}
