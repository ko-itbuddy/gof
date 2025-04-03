package com.example.singleton.ways;

public class NotThreadSafe {

	private static NotThreadSafe instance;

	private NotThreadSafe() {
	}

	public static NotThreadSafe getInstance() {
		if (instance == null) {
			instance = new NotThreadSafe();
		}

		return instance;
	}
}
