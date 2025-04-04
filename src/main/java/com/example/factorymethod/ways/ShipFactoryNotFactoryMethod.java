package com.example.factorymethod.ways;

public class ShipFactoryNotFactoryMethod {
	public static Ship orderShip(String name, String email) {
		// validate
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("배 이름을 지어주세요.");
		}

		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("연락처를 남겨주세요.");
		}

		prepareFor(name);

		Ship ship = new Ship();
		ship.setName(name);

		// Customizing for specific name
		if (name.equalsIgnoreCase("whiteship")) {
			ship.setLogo("♥︎");
		} else if (name.equalsIgnoreCase("blackship")) {
			ship.setLogo("♠");
		}

		//coloring
		if (name.equalsIgnoreCase("whiteship")) {
			ship.setColor("white");
		} else if (name.equalsIgnoreCase("blackship")) {
			ship.setColor("black");
		}

		sendEmailTo(email, ship);

		return ship;
	}

	private static void prepareFor(String name) {
		System.out.println(name + "을(를) 만들기 위한 준비 중입니다.");
	}

	private static void sendEmailTo(String email, Ship ship) {
		System.out.println(ship.getName() + " 배가 준비되었습니다.");
		System.out.println("이메일을 " + email + "로 발송합니다.");
		System.out.println("이메일 발송 완료");
	}
}
