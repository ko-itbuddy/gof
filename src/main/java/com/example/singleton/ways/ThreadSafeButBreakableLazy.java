package com.example.singleton.ways;

public class ThreadSafeButBreakableLazy {

	private static ThreadSafeButBreakableLazy INSTANCE = new ThreadSafeButBreakableLazy();

	private ThreadSafeButBreakableLazy() {
	}

	public static synchronized ThreadSafeButBreakableLazy getINSTANCE() {
		return INSTANCE;
	}
}
