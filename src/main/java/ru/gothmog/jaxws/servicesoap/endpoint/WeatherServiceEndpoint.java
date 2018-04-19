package ru.gothmog.jaxws.servicesoap.endpoint;

import de.codecentric.namespace.weatherservice.WeatherException;
import de.codecentric.namespace.weatherservice.WeatherService;
import de.codecentric.namespace.weatherservice.general.ForecastRequest;
import de.codecentric.namespace.weatherservice.general.ForecastReturn;
import de.codecentric.namespace.weatherservice.general.WeatherInformationReturn;
import de.codecentric.namespace.weatherservice.general.WeatherReturn;
import org.springframework.beans.factory.annotation.Autowired;
import ru.gothmog.jaxws.servicesoap.controller.WeatherServiceController;

public class WeatherServiceEndpoint implements WeatherService {

    @Autowired
    private WeatherServiceController weatherServiceController;

    @Override
    public ForecastReturn getCityForecastByZIP(ForecastRequest forecastRequest)
            throws WeatherException {
        // TODO Auto-generated method stub
        return weatherServiceController.getCityForecastByZIP(forecastRequest);
    }

    @Override
    public WeatherInformationReturn getWeatherInformation(String zip)
            throws WeatherException {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public WeatherReturn getCityWeatherByZIP(ForecastRequest forecastRequest)
            throws WeatherException {
        // TODO Auto-generated method stub
        return null;
    }
}
