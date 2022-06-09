package com.dropwizard.module;

import com.dropwizard.beans.Bathroom;
import com.dropwizard.beans.BathroomSink;
import com.dropwizard.beans.Room;
import com.dropwizard.beans.Kitchen;
import com.dropwizard.beans.KitchenSink;
import com.dropwizard.beans.Sink;
import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

public class AppModule extends AbstractModule {

  @Override
  public void configure() {
    bind(Sink.class).annotatedWith(Names.named("Kitchen")).to(KitchenSink.class).in(Singleton.class);
    bind(Sink.class).annotatedWith(Names.named("Bathroom")).to(BathroomSink.class).in(Singleton.class);
    
    bind(Room.class).annotatedWith(Names.named("Kitchen")).to(Kitchen.class);
    bind(Room.class).annotatedWith(Names.named("Bathroom")).to(Bathroom.class);
  }
}