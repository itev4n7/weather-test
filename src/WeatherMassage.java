public enum WeatherMassage {
    SUBZERO("It’s super cold today. Be sure you dressed well!"),
    COLD("It’s windy outside, but we are sure you will enjoy your day"),
    WARM("It’s time for outdoor walking!"),
    HOT("It's so hot outside!"),
    HELL("Welcome to hell!");

    private final String massage;

    WeatherMassage(String massage) {
        this.massage = massage;
    }

    public String getMassage() {
        return massage;
    }
}
