package weather;

public class IntRange implements Range {
    private final int lowerInclusiveBoundary;
    private final int upperInclusiveBoundary;

    public IntRange(int lowerInclusiveBoundary, int upperInclusiveBoundary) {
        this.lowerInclusiveBoundary = lowerInclusiveBoundary;
        this.upperInclusiveBoundary = upperInclusiveBoundary;
    }

    @Override
    public boolean isInRange(int value) {
        return value >= lowerInclusiveBoundary && value <= upperInclusiveBoundary;
    }
}
