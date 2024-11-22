package at.mci.claudiasteiner.vorbereitung4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Salami implements Pizza {
    private List<String> zutaten;

    Salami() {
        this.zutaten = new ArrayList<>(Arrays.asList("Käse", "Tomatensauce", "Salami"));
        prepare();
    }



    public void prepare(){
        System.out.println("Salami is prepared with " + zutaten);
    }
}