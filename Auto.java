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


    
    

    public static void main(String[] args) {
        for (int i = 0; i < 8; i++) {
            System.out.println(i);
            System.out.println(i&1);
            System.out.println(i+1);
            System.out.println((i&1)==0);
            System.out.println();
            
        }
    }
}
