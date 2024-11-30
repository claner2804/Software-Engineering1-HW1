package at.mci.claudiasteiner.Klausur;

class Vaporetto implements Transportation {
    @Override
    public void book(String from, String to) {
        System.out.println("Vaporetto (boat) booked from " + from + " to " + to);
    }
}