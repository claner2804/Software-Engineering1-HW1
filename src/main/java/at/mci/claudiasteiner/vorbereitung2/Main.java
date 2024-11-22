package at.mci.claudiasteiner.vorbereitung2;

public class Main {

    public static void main(String[] args) {

        Car highEndCar = new Car.CarBuilder("Ferrari", 500)
                .setColor("Rot")
                .setSeats(2)
                .setHybrid(true)
                .setHasNavi(true)
                .build();

        System.out.println(highEndCar);



        Car standardCar = new Car.CarBuilder("Kia",23)
                .build();

        System.out.println(standardCar);


        Car coolesCar = new Car.CarBuilder("Porsche Cayenne", 45)
                .setHasNavi(true)
                .setColor("Beige")
                .setSeats(4)
                .build();


        System.out.println(coolesCar);
    }

}
