package com.cg.demo;

public class DemoMain implements DemoInterface{

	public static void main(String[] args) {
		DemoMain demo = new DemoMain();
		demo.sayHello(); // abstract method calling
		demo.say(); // default method calling
		DemoInterface.sayMore(); // calling static method
	}

	@Override
	public void sayHello() {
		System.out.println("abstract method implementation");
	}

	/*
	 * @Override public void say() {
	 * System.out.println("overriden default method implementation"); }
	 */
}
