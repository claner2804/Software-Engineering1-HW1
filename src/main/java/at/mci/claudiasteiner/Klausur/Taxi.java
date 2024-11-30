package at.mci.claudiasteiner.Klausur;

//Concrete Transportation Implementations
class Taxi implements Transportation {
    @Override
    public void book(String from, String to) {
        System.out.println("Taxi booked from " + from + " to " + to);
    }
}