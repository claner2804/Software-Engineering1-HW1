package at.mci.claudiasteiner.week5.exercise4;

public class Main {
    public static void main(String[] args) {

        System.out.println("Building a Brick House:");
        House brickHouse = new BrickHouse();
        brickHouse.buildHouse();

        System.out.println("\nBuilding a Wooden House:");
        House woodenHouse = new WoodenHouse();
        woodenHouse.buildHouse();

        System.out.println("\nBuilding a Glass House:");
        House glassHouse = new GlassHouse();
        glassHouse.buildHouse();




    }
}
