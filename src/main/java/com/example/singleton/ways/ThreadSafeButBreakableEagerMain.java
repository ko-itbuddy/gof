package com.example.singleton.ways;

import java.lang.reflect.Constructor;

public class ThreadSafeButBreakableEagerMain {
	public static void main(String[] args) throws Throwable {
		ThreadSafeButBreakableEager instance1 = ThreadSafeButBreakableEager.getInstance();

		Constructor<ThreadSafeButBreakableEager> constructor = ThreadSafeButBreakableEager.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		ThreadSafeButBreakableEager instance2 = constructor.newInstance();

		System.out.println("Are both instances equal? " + (instance1 == instance2));
		System.out.println("Instance 1: " + instance1);
		System.out.println("Instance 2: " + instance2);
	}
}
