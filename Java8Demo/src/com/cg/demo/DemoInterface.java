package com.cg.demo;

@FunctionalInterface
public interface DemoInterface {

	public abstract void sayHello();
	
	default void say() {
		System.out.println("Default implementation");
	}
	
	static void sayMore() {
		System.out.println("static method implementation");
	}
}
