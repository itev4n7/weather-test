package weather.test;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import weather.WeatherMassage;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestWeather {

    @Parameterized.Parameters(name = "{index}:temperature({0})")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"-51C", WeatherMassage.INVALID.getMassage()},
                {"-50C", WeatherMassage.SUBZERO.getMassage()},
                {"-1C", WeatherMassage.SUBZERO.getMassage()},
                {"-0C", WeatherMassage.COLD.getMassage()},
                {"+10C", WeatherMassage.COLD.getMassage()},
                {"+11C", WeatherMassage.WARM.getMassage()},
                {"+30C", WeatherMassage.WARM.getMassage()},
                {"+31C", WeatherMassage.HOT.getMassage()},
                {"+40C", WeatherMassage.HOT.getMassage()},
                {"+41C", WeatherMassage.HELL.getMassage()},
                {"+50C", WeatherMassage.HELL.getMassage()},
                {"+51C", WeatherMassage.INVALID.getMassage()}
        });
    }

    private final WeatherBase weather;
    private final String inputValue;
    private final String expectedMassage;

    public TestWeather(String inputValue, String expectedMassage) {
        this.weather = new WeatherBase();
        this.inputValue = inputValue;
        this.expectedMassage = expectedMassage;
    }

    @Test
    public void testWeatherResults() {
        Assert.assertEquals(expectedMassage, weather.testPrintWeather(inputValue));
    }
}
