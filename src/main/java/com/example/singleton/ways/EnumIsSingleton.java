package com.example.singleton.ways;

// this is the best way to implement a singleton in Java
// it is thread-safe, lazy-loaded, and cannot be broken by reflection
// it is eager-loaded, so it is not lazy-loaded
public enum EnumIsSingleton {
	INSTANCE;

}
