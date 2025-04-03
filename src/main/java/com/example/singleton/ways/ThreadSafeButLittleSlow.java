package com.example.singleton.ways;

public class ThreadSafeButLittleSlow {

	private static ThreadSafeButLittleSlow instance;

	private ThreadSafeButLittleSlow() {
	}

	public static synchronized ThreadSafeButLittleSlow getInstance() {
		if (instance == null) {
			instance = new ThreadSafeButLittleSlow();
		}

		return instance;
	}
}
