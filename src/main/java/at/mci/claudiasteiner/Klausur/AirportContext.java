package at.mci.claudiasteiner.Klausur;

//for managing airport-specific bookings
class AirportContext {
    private String airportName;
    private TransportationFactory transportationFactory;
    private Payment paymentMethod;

    public AirportContext(String airportName, TransportationFactory transportationFactory, Payment paymentMethod) {
        this.airportName = airportName;
        this.transportationFactory = transportationFactory;
        this.paymentMethod = paymentMethod;
    }

    public void bookRide(String from, String to, double amount) {
        Transportation transportation = transportationFactory.createTransportation();
        System.out.println("Yay we got a new Booking from " + airportName + "...");
        transportation.book(from, to);
        paymentMethod.pay(amount);
    }
}