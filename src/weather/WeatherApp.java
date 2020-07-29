package weather;

import java.util.Scanner;
import java.util.stream.Stream;

public class WeatherApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stream.of(parseInput(scanner.nextLine()))
                .map(Integer::parseInt)
                .forEach(WeatherApp::printWeather);
    }

    private static void printWeather(int temperature) {
        String massage = Stream.of(WeatherRange.values())
                .filter(it -> it.getRange().isInRange(temperature))
                .findFirst()
                .map(WeatherRange::getMassage)
                .orElse("Please re-check results in 5 mins.");
        System.out.println(massage);
    }

    private static String parseInput(String value) {
        return value.trim().toLowerCase().replace("c", "").replace(" ", "");
    }
}
