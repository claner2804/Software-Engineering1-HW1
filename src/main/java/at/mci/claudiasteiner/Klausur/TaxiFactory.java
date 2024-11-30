package at.mci.claudiasteiner.Klausur;

class TaxiFactory extends TransportationFactory {
    @Override
    public Transportation createTransportation() {
        return new Taxi();
    }
}