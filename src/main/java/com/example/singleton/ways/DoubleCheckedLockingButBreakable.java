package com.example.singleton.ways;

public class DoubleCheckedLockingButBreakable {

	private static volatile DoubleCheckedLockingButBreakable instance;

	private DoubleCheckedLockingButBreakable() {
	}

	public static synchronized DoubleCheckedLockingButBreakable getInstance() {

		if (instance == null) {
			synchronized (DoubleCheckedLockingButBreakable.class) {
				if (instance == null) {
					instance = new DoubleCheckedLockingButBreakable();
				}
			}
		}

		return instance;
	}
}
