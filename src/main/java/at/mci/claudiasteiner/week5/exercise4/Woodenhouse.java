package at.mci.claudiasteiner.week5.exercise4;

// Concrete class for a WoodenHouse
class WoodenHouse extends House {
    @Override
    protected void buildWalls() {
        System.out.println("Building wooden walls.");
    }

    @Override
    protected void setDoorsAndWindows() {
        System.out.println("Installing wooden doors and wooden-framed windows.");
    }
}