package com.dropwizard.beans;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import lombok.Getter;

public class House {
	@Inject @Named("Bathroom")
	@Getter
	private Room bathroom;
	
	@Inject @Named("Kitchen")
	@Getter
	private Room kitchen;

	public void print() {
		System.out.println(bathroom.getSink());
		System.out.println(kitchen.getSink());
		
		bathroom.getSink().name();
		kitchen.getSink().name();
	}
}