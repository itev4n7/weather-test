package weather.test;

import weather.WeatherApp;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class WeatherBase extends WeatherApp {

    public String testPrintWeather(String value) {
        return printWeather(Stream.of(parseInput(value))
                .map(Integer::parseInt)
                .collect(Collectors.toList())
                .get(0));
    }
}
