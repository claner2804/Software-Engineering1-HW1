package at.mci.claudiasteiner.vorbereitung2;

public class Car {
    //verpflichtende
    private String model;
    private int motor;

    //optionale
    private String color;
    private int seats;
    private boolean isHybrid;
    private boolean hasNavi;


    //privater Konstruktor
    //	    this.gpu = (gpu == null) ? "Keine Grafikkarte" : gpu;
    private Car(String model, int motor, String color, int seats, boolean isHybrid, boolean hasNavi) {
        //verpflichtende
        this.model = model;
        this.motor = motor;

        //optionale
        this.color = (color == null) ? "Weiß" : color;
        this.seats = (seats == 0) ? 5 : seats;
        this.isHybrid = isHybrid;
        this.hasNavi = hasNavi;
    }

    public String getModel() {
        return model;
    }

    public int getMotor() {
        return motor;
    }

    public String getColor() {
        return color;
    }

    public int getSeats() {
        return seats;
    }

    public boolean isHybrid() {
        return isHybrid;
    }

    public boolean isHasNavi() {
        return hasNavi;
    }

    @Override
    public String toString() {
        return "************************ \n" +
                "Das generierte Auto hat folgende Eigenschaften: " + "\n" +
                "Modell = " + model + "\n" +
                "Motor = " + motor + "\n" +
                "Farbe = " + color + "\n" +
                "Sitze = " + seats + "\n" +
                "Hybridmotor = " + isHybrid + "\n" +
                "Navi = " + hasNavi + "\n" +
                "************************ \n";
    }


    //static inner builder class
    public static class CarBuilder{
        //verpflichtende
        private String model;
        private int motor;

        //optionale
        private String color;
        private int seats;
        private boolean isHybrid;
        private boolean hasNavi;


        public CarBuilder(String model, int motor) {
            this.model = model;
            this.motor = motor;
        }

        public CarBuilder setColor(String color) {
            this.color = color;
            return this;
        }

        public CarBuilder setSeats(int seats) {
            this.seats = seats;
            return this;
        }

        public CarBuilder setHybrid(boolean hybrid) {
            isHybrid = hybrid;
            return this;
        }

        public CarBuilder setHasNavi(boolean hasNavi) {
            this.hasNavi = hasNavi;
            return this;
        }

        public Car build(){
            return new Car(model, motor, color, seats, isHybrid, hasNavi);
        }

    }


}
