package at.mci.claudiasteiner.Klausur;

class VaporettoFactory extends TransportationFactory {
    @Override
    public Transportation createTransportation() {
        return new Vaporetto();
    }
}