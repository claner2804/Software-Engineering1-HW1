package at.mci.claudiasteiner.week5.exercise4;

// Abstract class defining the template method
abstract class House {

    // Template method - defines the order of construction
    public final void buildHouse() {
        buildFoundation();
        buildWalls();
        placeRoof();
        setDoorsAndWindows();
    }
    // Common steps for all house types
    private void buildFoundation() {
        System.out.println("Building foundation with concrete, steel rods, and gravel.");
    }

    private void placeRoof() {
        System.out.println("Placing the roof.");
    }

    // Steps that can be customized by subclasses
    protected abstract void buildWalls();
    protected abstract void setDoorsAndWindows();
}