package com.dropwizard.beans;

public class BathroomSink implements Sink{
	@Override
	public void name() {
		System.out.println("BathroomSink");
	}
}