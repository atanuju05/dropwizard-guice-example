package com.dropwizard.beans;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import com.google.inject.name.Named;

@Singleton
public class Bathroom  implements Room{
  @Inject @Named("Bathroom")
  private Sink sink;
  @Inject
  private Shower shower;
}