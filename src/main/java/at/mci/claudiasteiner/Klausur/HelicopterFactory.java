package at.mci.claudiasteiner.Klausur;

class HelicopterFactory extends TransportationFactory {
    @Override
    public Transportation createTransportation() {
        return new Helicopter();
    }
}