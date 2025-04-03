package com.example.singleton.ways;

public class ThreadSafeButBreakableEager {

	private static final ThreadSafeButBreakableEager INSTANCE = new ThreadSafeButBreakableEager();

	private ThreadSafeButBreakableEager() {
	}

	public static synchronized ThreadSafeButBreakableEager getInstance() {
		return INSTANCE;
	}
}
