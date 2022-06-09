package com.dropwizard.beans;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public class House {
	@Inject @Named("Bathroom")
	private Room bathroom;
	
	@Inject @Named("Kitchen")
	private Room kitchen;

	public void print() {
		System.out.println(bathroom);
		System.out.println(kitchen);
	}
}