package com.example.singleton.ex;

public class RuntimeExample {
	public static void main(String[] args) {
		Runtime runtime = Runtime.getRuntime();
		System.out.println(runtime.maxMemory());
		System.out.println(runtime.totalMemory());
	}
}
