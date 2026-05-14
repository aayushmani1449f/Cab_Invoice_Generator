package com.cabinvoice;

public class InvoiceService {
    private RideRepository rideRepository;
    private CabInvoiceGenerator invoiceGenerator;

    public InvoiceService() {
        this.rideRepository = new RideRepository();
        this.invoiceGenerator = new CabInvoiceGenerator();
    }

    public void addRides(String userId, Ride[] rides) {
        this.rideRepository.addRides(userId, rides);
    }

    public InvoiceSummary getInvoiceSummary(String userId) {
        Ride[] rides = this.rideRepository.getRides(userId);
        return this.invoiceGenerator.getInvoiceSummary(rides);
    }
}
