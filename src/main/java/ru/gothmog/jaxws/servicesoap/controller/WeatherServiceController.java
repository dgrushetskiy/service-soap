package ru.gothmog.jaxws.servicesoap.controller;

import de.codecentric.namespace.weatherservice.general.ForecastRequest;
import de.codecentric.namespace.weatherservice.general.ForecastReturn;
import org.springframework.stereotype.Component;
import ru.gothmog.jaxws.servicesoap.transformation.GetCityForecastByZIPOutMapper;

@Component
public class WeatherServiceController {

    public ForecastReturn getCityForecastByZIP(ForecastRequest forecastRequest) {
        /*
         * We leave out inbound transformation, plausibility-checking, logging, backend-calls e.g.
         * for the moment
         */
        return GetCityForecastByZIPOutMapper.mapGeneralOutlook2Forecast();
    }

    /*
     * Other Methods would follow here...
     */
    //public WeatherReturn getCityWeatherByZIP(ForecastRequest forecastRequest) throws BusinessException {}

    //public WeatherInformationReturn getWeatherInformation(String zip) throws BusinessException {}
}
