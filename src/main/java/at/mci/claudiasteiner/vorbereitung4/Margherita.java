package at.mci.claudiasteiner.vorbereitung4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Margherita implements Pizza {
    private List<String> zutaten;

    Margherita() {
        this.zutaten = new ArrayList<>(Arrays.asList("Käse", "Tomatensauce", "Basilikum"));
        prepare();
    }



    public void prepare(){
        System.out.println("Margherita is prepared with " + zutaten);
    }
}
