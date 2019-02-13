import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // initialiert ein VierGewinnt-Spiel mit SpielerNamen und Höhe und Breite des Spielfeldes
        VierGewinnt aktuellesSpiel = new VierGewinnt();
        aktuellesSpiel.starteSpiel();
        aktuellesSpiel.zeigeSpielfeld();
        while (aktuellesSpiel.machEinenZug()) ;


        aktuellesSpiel.zeigeSpielfeld();


    }
}
