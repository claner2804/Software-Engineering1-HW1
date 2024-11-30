package at.mci.claudiasteiner.Klausur;

class Helicopter implements Transportation {
    @Override
    public void book(String from, String to) {
        System.out.println("Helicopter booked from " + from + " to " + to);
    }
}