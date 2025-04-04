package com.example.factorymethod.ways;

public interface ShipFactory {

	default Ship orderShip(String name, String email) {
		validate(name, email);

		prepareFor(name);

		Ship ship = createShip(name);

		sendEmailTo(email);

		return ship;
	}

	Ship createShip(String name);

	private void validate(String name, String email) {
		if (name == null || name.isBlank()) {
			throw new IllegalArgumentException("배 이름은 필수입니다.");
		}
		if (email == null || email.isBlank()) {
			throw new IllegalArgumentException("이메일은 필수입니다.");
		}
	}

	private void prepareFor(String name) {
		System.out.println(name + "을(를) 만들기 위한 준비 중입니다.");
	}

	private void sendEmailTo(String email) {
		System.out.println("배가 준비 되었습니다.");
		System.out.println("이메일 발송 완료");
	}

}
