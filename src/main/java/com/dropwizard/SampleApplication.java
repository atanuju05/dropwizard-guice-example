package com.dropwizard;

import io.dropwizard.Application;
import io.dropwizard.Configuration;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import ru.vyarus.dropwizard.guice.GuiceBundle;

/**
 * @author Vyacheslav Rusakov
 * @since 05.02.2017
 */
public class SampleApplication extends Application<Configuration> {

	public static void main(String[] args) throws Exception {
		new SampleApplication().run(args);
	}

	@Override
	public void initialize(Bootstrap<Configuration> bootstrap) {
		bootstrap.addBundle(GuiceBundle.builder().enableAutoConfig(getClass().getPackage().getName())
				.modules(new SampleModule()).build());
	}

	@Override
	public void run(Configuration configuration, Environment environment) throws Exception {
	}
}