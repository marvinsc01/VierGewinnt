import java.util.Scanner;

public class VierGewinnt {

    // Das Spielfeld
    Boolean[][] spielfeld;

    // Spielername 1
    String spielerName1;

    // Spielername 2
    String spielerName2;

    // Aktueller Spieler
    String aktuellerSpieler;

    // Symbol Spieler 1
    String Spieler1Symbol = "x";

    // Symbol Spieler 2
    String Spieler2Symbol = "o";

    public void starteSpiel() {

        Scanner scan = new Scanner(System.in);

        System.out.println("~Spiel startet~");
        //Hier werden die Namen der Spieler eingetragen
        System.out.println("Spieler 1 - Bitte Name eingeben: ");
        spielerName1 = scan.next();
        System.out.println("Spieler 2 - Bitte Name eingeben: ");
        spielerName2 = scan.next();

        //Hier wird die Größe des Spielfelds eingetragen
        System.out.println("Höhe des Spielfelds eingeben: ");
        Integer hoehe = scan.nextInt();
        System.out.println("Breite des Spielfelds eingeben: ");
        Integer breite = scan.nextInt();

        spielfeld = new Boolean[hoehe][breite];

        System.out.println("Spielbedingungen: ");
        System.out.println("-----------------");
        System.out.println("Spieler 1 ist  " + spielerName1);
        System.out.println("Spieler 2 ist  " + spielerName2);


        int wuerfel = (int) ((Math.random()) * 2);

        if (wuerfel == 0)
            aktuellerSpieler = spielerName1;
        else
            aktuellerSpieler = spielerName2;

        System.out.println("Aktueller Spieler ist: " + aktuellerSpieler);
        System.out.println("-----------------");


    }

    public void zeigeSpielfeld() {

        for (int i = 0; i < spielfeld.length - 3; i++) {
            System.out.println(" ");

            for (int j = 0; j < spielfeld[i].length; j++) {
                System.out.print("|");

                if (spielfeld[i][j] == null)
                    System.out.print(" ");
                else if (spielfeld[i][j])
                    System.out.print(Spieler1Symbol);
                else
                    System.out.print(Spieler2Symbol);

                if (j == spielfeld[i].length - 1) {
                    System.out.print("|");

                }
            }
        }
    }

    public boolean machEinenZug() {

        int spalte = spalteEinlesen();

        for (int i = 0; i < spielfeld.length; i++) {


            // Ist die Spalte voll??
            if (spielfeld[i][spalte - 1] != null)
                return false;

            // Sind wir ganz unten?
            if (i == spielfeld.length - 1 && spielfeld[i][spalte - 1] == null) {

                if (aktuellerSpieler == spielerName1) {
                    spielfeld[i][spalte - 1] = true;
                    break;
                } else {
                    spielfeld[i][spalte - 1] = false;
                    break;
                }
            }

            // ist unter der aktuellen Position schon etwas gesetzt? Wenn ja, dann muss der Stein hier bleiben.
            if (i < spielfeld.length - 1 && spielfeld[i][spalte - 1] == null && spielfeld[i + 1][spalte - 1] != null)

                if (aktuellerSpieler == spielerName1) {
                    spielfeld[i][spalte - 1] = true;
                    break;

                } else {
                    spielfeld[i][spalte - 1] = false;
                    break;
                }


        }
        if (aktuellerSpieler == spielerName1){

            aktuellerSpieler = spielerName2;
            System.out.println("\n"+"-----------------");
            System.out.println( spielerName2+" ist dran");
            System.out.println("-----------------");
        }
        else{

            aktuellerSpieler = spielerName1;
            System.out.println("\n"+"-----------------");
            System.out.println( spielerName1+" ist dran");
            System.out.println("-----------------");
        }
        zeigeSpielfeld();
        return true;


    }

    public int WerHatGewonnen(){

        if (spielfeld[i][])
    }


    public int spalteEinlesen() {

        Scanner scanner = new Scanner(System.in);

        boolean nichtOk = false;
        int spalte;

        do {

            System.out.println("\n" + "In welche Spalte willst du einwerfen?");
            spalte = scanner.nextInt();

            if (spalte > spielfeld[0].length)
                nichtOk = true;

            else if (spalte < 0)
                nichtOk = true;

            else
                nichtOk = false;


            if (nichtOk)
                System.out.println("Der eingegebene Wert ist nicht in Ordnung, bitte wiederholen!");


        }
        while (nichtOk);

        return spalte;

    }


    //    System.out.println("Spiel startet" + "\n");
    //
    //        Scanner scan = new Scanner(System.in);
    //
    //        //Hier werden die Namen der Spieler eingetragen
    //        System.out.println("Spieler 1 - Bitte Name eingeben: ");
    //        String player1 = scan.next();
    //        System.out.println("Spieler 2 - Bitte Name eingeben: ");
    //        String player2 = scan.next();
    //        System.out.print("Spieler 1 ist  " + player1);
    //        System.out.println("  ");
    //        System.out.println("Spieler 2 ist  " + player2);
    //
    //        //Hier wird die Größe des Spielfelds eingetragen
    //        System.out.println("Höhe des Spielfelds eingeben: ");
    //        Integer hoehe = scan.nextInt();
    //        System.out.println("Breite des Spielfelds eingeben: ");
    //        Integer breite = scan.nextInt();
    //
    //        // Hier eingeben an welcher Position ein Punkt gesetzt werden soll
    //        System.out.println("Position füt X-Achse eingeben: ");
    //        Integer xwert = scan.nextInt();
    //        System.out.println("Position für Y-Achse eingeben: ");
    //        Integer ywert = scan.nextInt();
    //
    //        for (int yy = 1; yy <= hoehe; yy++) {
    //            System.out.println(" ");
    //            //Hier wird der Spielfeldrand generiert
    //            for (int y = 1; y <= breite; y++) {
    //                System.out.print("|");
    //                //Hier wird ein X an einer bestimmten Position gesetzt
    //                if(yy == ywert && y == xwert)
    //                    System.out.print("x");
    //                else
    //                    System.out.print(" ");
    //                if (y == breite) {
    //                    System.out.print("|");
    //
    //                }
    //            }
    //        })
}