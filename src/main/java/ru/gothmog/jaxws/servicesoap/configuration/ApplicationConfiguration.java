package ru.gothmog.jaxws.servicesoap.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.gothmog.jaxws.servicesoap.controller.WeatherServiceController;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public WeatherServiceController weatherServiceController() {
        return new WeatherServiceController();
    }
}
