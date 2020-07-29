import java.util.Scanner;
import java.util.stream.Stream;

public class Task {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stream.of(scanner.nextLine().trim())
                .map(s -> Integer.parseInt(s.replace("C", "")))
                .forEach(Task::printWeather);
    }

    public static void printWeather(int temperature) {
        if (temperature <= -1 && temperature >= -50) {
            System.out.println("It’s super cold today. Be sure you dressed well!");
        } else if (temperature >= 0 && temperature <= 10) {
            System.out.println("It’s windy outside, but we are sure you will enjoy your day");
        } else if (temperature >= 11 && temperature <= 30) {
            System.out.println("It’s time for outdoor walking!");
        } else if (temperature >= 31 && temperature <= 40) {
            System.out.println("It's so hot outside!");
        } else if (temperature >= 41 && temperature <= 50) {
            System.out.println("Welcome to hell!");
        } else {
            System.out.println("Please re-check results in 5 mins.");
        }
    }
}
