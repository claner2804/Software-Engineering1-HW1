package at.mci.claudiasteiner.Klausur;

/*
Strategy Pattern is used for payment methods, making it easy to switch between options like credit card, PayPal, or bank transfer.
Factory Method Pattern is used to create different types of transportation, such as taxis, motorbikes, vaporettos, or helicopters.
 */


public class Main {
    public static void main(String[] args) {
        //Innsbruck Taxi with Credit Card
        AirportContext innsbruckAirport = new AirportContext(
                "Innsbruck Airport",
                new TaxiFactory(),
                new CreditCardPayment()
        );
        innsbruckAirport.bookRide("Innsbruck Airport", "City Center", 25.0);

        //Las Vegas Helicopter with PayPal
        AirportContext lasVegasAirport = new AirportContext(
                "Las Vegas Airport",
                new HelicopterFactory(),
                new PayPalPayment()
        );
        lasVegasAirport.bookRide("Las Vegas Airport", "City Center", 150.0);

        //Venice Vaporetto with Bank Transfer
        AirportContext veniceAirport = new AirportContext(
                "Venice Airport",
                new VaporettoFactory(),
                new BankTransferPayment()
        );
        veniceAirport.bookRide("Venice Airport", "City Center", 35.0);

        //Jakarta Motorbike with Credit Card
        AirportContext jakartaAirport = new AirportContext(
                "Jakarta Airport",
                new MotorbikeFactory(),
                new CreditCardPayment()
        );
        jakartaAirport.bookRide("Jakarta Airport", "City Center", 15.0);
    }
}