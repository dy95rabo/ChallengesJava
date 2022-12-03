import java.awt.Color;

import lombok.Data;

@Data
public class Auto {
    private Color farbe;
    private int anzahlTueren;
    private final int anzahlRaeder = 4;


    public void honk(){
        System.out.println("honk honk!!!");
    }


    
    

}
