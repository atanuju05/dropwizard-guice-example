package com.dropwizard;

import com.dropwizard.module.AppModule;

import io.dropwizard.Configuration;
import ru.vyarus.dropwizard.guice.module.support.DropwizardAwareModule;

/**
 * @author Vyacheslav Rusakov
 * @since 12.02.2017
 */
public class SampleModule extends DropwizardAwareModule<Configuration> {

    @Override
    protected void configure() {
        install(new AppModule());

        // example access to dropwizard objects from module
        configuration();
        environment();
        bootstrap();
    }
}