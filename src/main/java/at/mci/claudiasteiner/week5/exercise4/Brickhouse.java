package at.mci.claudiasteiner.week5.exercise4;


// Concrete class for a BrickHouse
class BrickHouse extends House {
    @Override
    protected void buildWalls() {
        System.out.println("Building brick walls.");
    }

    @Override
    protected void setDoorsAndWindows() {
        System.out.println("Installing wooden doors and glass windows.");
    }
}