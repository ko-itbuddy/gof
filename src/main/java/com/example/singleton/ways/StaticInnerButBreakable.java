package com.example.singleton.ways;

public class StaticInnerButBreakable {

	private StaticInnerButBreakable() {
	}

	private static class Holder {
		private static final StaticInnerButBreakable INSTANCE = new StaticInnerButBreakable();
	}

	public static synchronized StaticInnerButBreakable getInstance() {
		return Holder.INSTANCE;
	}
}
