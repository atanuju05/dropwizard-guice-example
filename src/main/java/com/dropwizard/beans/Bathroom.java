package com.dropwizard.beans;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

import lombok.Getter;

@Singleton
public class Bathroom  implements Room{
  @Inject @Named("Bathroom")
  @Getter
  private Sink sink;
  @Inject
  private Shower shower;
}