package at.mci.claudiasteiner.vorbereitung1;

public class Computer {
    private String processor;
    private int ram;
    private String memory;
    private String gpu;

    //private constructor
    //Da grafikkarte optional ist muss man den Konstruktor anpassen:
    // wenn grafikkarte dann grafikkarte und wenn nicht dann
    // "keine grafikkarte"
    private Computer(String processor, int ram, String memory, String gpu) {
        this.processor = processor;
        this.ram = ram;
        this.memory = memory;
        this.gpu = (gpu == null) ? "Keine Grafikkarte" : gpu;
    }

    public String getProcessor() {
        return processor;
    }

    public int getRam() {
        return ram;
    }


    public String getMemory() {
        return memory;
    }


    public String getGpu() {
        return gpu;
    }

    @Override
    public String toString() {
        return "********************** \n" +
                "Der generierte Computer hat folgende Eigenschaften: " + "\n" +
                "Prozessor = " + processor + "\n" +
                "RAM = " + ram + "\n" +
                "Speicher = " + memory + "\n" +
                "Grafikkarte = " + gpu + "\n" +
                "************************ \n";
    }

    //static inner builder class
    public static class ComputerBuilder {
        private String processor;
        private int ram;
        private String memory;
        private String gpu;


        //Public Konstruktor von ComputerBuilder mit allen
        // FÜR VERPFLICHTENDE FELDER
        public ComputerBuilder(String processor, int ram, String memory) {
            this.processor = processor;
            this.ram = ram;
            this.memory = memory;
        }


        //	Public setter mit rückgabewert COMPUTERBUILDER und this
        //Für Optionale Eigenschaften
        public ComputerBuilder setGpu(String gpu) {
            this.gpu = gpu;
            return this;
        }


        //Build methode mit rückgabewert computer
        // und return new computer mit allen eigenschaften
        public Computer build() {
            return new Computer(processor, ram, memory, gpu);
        }



    }

}
