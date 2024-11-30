package at.mci.claudiasteiner.Klausur;


class Motorbike implements Transportation {
    @Override
    public void book(String from, String to) {
        System.out.println("Motorbike booked from " + from + " to " + to);
    }
}