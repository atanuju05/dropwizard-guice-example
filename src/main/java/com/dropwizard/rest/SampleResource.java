package com.dropwizard.rest;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import com.dropwizard.beans.House;
import com.dropwizard.beans.Sink;
import com.google.inject.Injector;
import com.google.inject.Key;
import com.google.inject.name.Names;

/**
 * @author Vyacheslav Rusakov
 * @since 05.02.2017
 */
@Path("/sample")
@Produces("application/json")
public class SampleResource {

	@Inject
	private Provider<HttpServletRequest> requestProvider;
	
	@Inject 
	Injector injector;
	
	@Inject
	private House house;

	@GET
	@Path("/")
	public Response ask() {
		final String ip = requestProvider.get().getRemoteAddr();
		
		Sink sink = injector.getInstance(Key.get(Sink.class, Names.named("Kitchen")));
		Sink sink2 = injector.getInstance(Key.get(Sink.class, Names.named("Bathroom")));
		
		System.out.println(house);
		System.out.println(sink);
		System.out.println(sink2);
		
		return Response.ok(ip).build();
	}
}