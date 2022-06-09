package com.dropwizard.beans;

public class KitchenSink implements Sink{

	@Override
	public void name() {
		System.out.println("KitchenSink");
	}

}
