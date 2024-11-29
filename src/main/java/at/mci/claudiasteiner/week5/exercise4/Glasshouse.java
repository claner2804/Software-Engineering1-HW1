package at.mci.claudiasteiner.week5.exercise4;

// Concrete class for a GlassHouse
class GlassHouse extends House {
    @Override
    protected void buildWalls() {
        System.out.println("Building glass walls.");
    }

    @Override
    protected void setDoorsAndWindows() {
        System.out.println("Installing sliding glass doors and panoramic windows.");
    }
}