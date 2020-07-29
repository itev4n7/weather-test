package weather;

public enum WeatherRange {
    SUBZERO(new IntRange(-50, -1), WeatherMassage.SUBZERO),
    COLD(new IntRange(0, 10), WeatherMassage.COLD),
    WARM(new IntRange(11, 30), WeatherMassage.WARM),
    HOT(new IntRange(31, 40), WeatherMassage.HOT),
    HELL(new IntRange(41, 50), WeatherMassage.HELL);

    private final IntRange range;
    private final WeatherMassage weather;

    WeatherRange(IntRange range, WeatherMassage weather) {
        this.weather = weather;
        this.range = range;
    }

    public IntRange getRange() {
        return range;
    }

    public String getMassage() {
        return weather.getMassage();
    }
}
