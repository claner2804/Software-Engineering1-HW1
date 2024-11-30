package at.mci.claudiasteiner.Klausur;

class MotorbikeFactory extends TransportationFactory {
    @Override
    public Transportation createTransportation() {
        return new Motorbike();
    }
}