

public class InvoiceSummary {
    public int numOfRides;
    public double totalFare;
    public double averageFare;

    public InvoiceSummary(int numOfRides, double totalFare) {
        this.numOfRides = numOfRides;
        this.totalFare = totalFare;
        this.averageFare = this.numOfRides == 0 ? 0 : this.totalFare / this.numOfRides;
    }
}
