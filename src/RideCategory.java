

public enum RideCategory {
    NORMAL(10.0, 1, 5.0),
    PREMIUM(15.0, 2, 20.0);

    public final double costPerKm;
    public final int costPerMinute;
    public final double minimumFare;

    RideCategory(double costPerKm, int costPerMinute, double minimumFare) {
        this.costPerKm = costPerKm;
        this.costPerMinute = costPerMinute;
        this.minimumFare = minimumFare;
    }

    public double calculateCategoryFare(double distance, int time) {
        double totalFare = distance * costPerKm + time * costPerMinute;
        return Math.max(totalFare, minimumFare);
    }
}
