package com.dropwizard.beans;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import lombok.Getter;

@Singleton
public class Kitchen implements Room{
  @Inject @Named("Kitchen")
  @Getter
  private Sink sink;
  
  @Inject
  private Stove stove;
}