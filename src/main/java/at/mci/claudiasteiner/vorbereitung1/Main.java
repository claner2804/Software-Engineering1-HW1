package at.mci.claudiasteiner.vorbereitung1;

public class Main {

    public static void main(String[] args) {

        Computer computer = new Computer.ComputerBuilder("Intel", 12, "500 GB")
                .setGpu("NVDIA")
                .build();


        System.out.println(computer);

    }
}
