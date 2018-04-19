package ru.gothmog.jaxws.servicesoap.transformation;


import de.codecentric.namespace.weatherservice.datatypes.*;
import de.codecentric.namespace.weatherservice.general.ForecastReturn;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.time.ZonedDateTime;
import java.util.GregorianCalendar;

public final class GetCityForecastByZIPOutMapper {

    private static de.codecentric.namespace.weatherservice.general.ObjectFactory objectFactoryGeneral = new de.codecentric.namespace.weatherservice.general.ObjectFactory();
    private static de.codecentric.namespace.weatherservice.datatypes.ObjectFactory objectFactoryDataTypes = new ObjectFactory();

    public static ForecastReturn mapGeneralOutlook2Forecast() {
        ForecastReturn forecastReturn = objectFactoryGeneral.createForecastReturn();
        forecastReturn.setCity("Weimar");
        forecastReturn.setState("Deutschland");
        forecastReturn.setSuccess(true);
        forecastReturn.setWeatherStationCity("Weimar");
        forecastReturn.setForecastResult(generateForecastResult(forecastReturn.getCity()));
        return forecastReturn;
    }

    private static ArrayOfForecast generateForecastResult(String city) {
        ArrayOfForecast forecastContainer = objectFactoryDataTypes.createArrayOfForecast();
        forecastContainer.getForecast().add(generateForecast(city));
        return forecastContainer;
    }

    private static Forecast generateForecast(String city) {
        Forecast forecast = objectFactoryDataTypes.createForecast();
        forecast.setDate(generateCalendarFromNow());
        forecast.setDesciption("Vorhersage für " + city);
        forecast.setTemperatures(generateTemp());
        forecast.setProbabilityOfPrecipiation(generateRegenwahrscheinlichkeit());
        return forecast;
    }

    private static POP generateRegenwahrscheinlichkeit() {
        POP pop = objectFactoryDataTypes.createPOP();
        pop.setDaytime("22%");
        pop.setNighttime("5000%");
        return pop;
    }

    private static Temp generateTemp() {
        Temp temp = objectFactoryDataTypes.createTemp();
        temp.setDaytimeHigh("90°");
        temp.setMorningLow("0°");
        return temp;
    }

    private static XMLGregorianCalendar generateCalendarFromNow() {
        GregorianCalendar gregCal = GregorianCalendar.from(ZonedDateTime.now());
        XMLGregorianCalendar xmlGregCal = null;
        try {
            xmlGregCal = DatatypeFactory.newInstance().newXMLGregorianCalendar(gregCal);
        } catch (DatatypeConfigurationException exception) {
            //LOG.calenderMappingNotWorking(exception);
        }
        return xmlGregCal;
    }
}
