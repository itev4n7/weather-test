package weather;

import java.util.Scanner;
import java.util.stream.Stream;

public class WeatherApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stream.of(parseInput(scanner.nextLine()))
                .map(Integer::parseInt)
                .forEach(s -> System.out.println(printWeather(s)));
    }

    protected static String printWeather(int temperature) {
        return Stream.of(WeatherRange.values())
                .filter(it -> it.getRange().isInRange(temperature))
                .findFirst()
                .map(WeatherRange::getMassage)
                .orElse(WeatherMassage.INVALID.getMassage());
    }

    protected static String parseInput(String value) {
        return value.trim().toLowerCase().replace("c", "").replace(" ", "");
    }
}
