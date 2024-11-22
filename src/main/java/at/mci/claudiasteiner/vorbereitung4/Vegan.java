package at.mci.claudiasteiner.vorbereitung4;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Vegan implements Pizza {
    private List<String> zutaten;

    Vegan() {
        this.zutaten = new ArrayList<>(Arrays.asList("veganem Käse", "Tomatensauce", "Gemüse"));
        prepare();
    }



    public void prepare(){
        System.out.println("Vegan is prepared with " + zutaten);
    }
}