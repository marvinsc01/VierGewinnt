import java.util.Scanner;

public class test {

    public static void main(String[] args) {

        System.out.println("Spiel startet");

        Scanner scan = new Scanner(System.in);
        // Hier eingeben, wie groß das Spielfeld sein soll

        System.out.println("Höhe des Spielfelds eingeben: ");
        Integer hoehe = scan.nextInt();

        System.out.println("Breite des Spielfelds eingeben: ");
        Integer breite = scan.nextInt();


        System.out.println("Position auf der X-Achse eingeben: ");
        Integer xwert = scan.nextInt();

        System.out.println("Position auf der Y-Achse eingeben: ");
        Integer ywert = scan.nextInt();


        int punkt [][] = new int [hoehe][breite];

        for (int zr = 0; zr < breite; zr++){
            for (int re = 0;re < hoehe;re++){
                punkt [zr][re] = -1;
            }
        }
        System.out.println("");

        for (int a = 0; a < hoehe; a++){
            int b =  xwert;
            int c =  ywert;
            punkt [b][c] = 0;

        }
        System.out.println();

        for (int zr = 0; zr < breite; zr++) {
            for (int re = 0;re < hoehe;re++) {
                if (punkt[zr][re] == -1) {
                    System.out.print(" " + "|");
                }
                if (punkt[zr][re] == 0) {
                    System.out.println("x" + "|");

                }
            }
        }










                // Hier das Spielfeld mit lauter X oder Os mal ausgeben
                System.out.println("\n");
                System.out.println("Spieler 1 - Bitte Name eingeben: ");
                String player1 = scan.next();
                System.out.println("Spieler 2" +
                        " - Bitte Name eingeben: ");
                String player2 = scan.next();

                System.out.print("Spieler 1 ist  " + player1);
                System.out.println("  ");
                System.out.println("Spieler 2 ist  " + player2);


            }
        }


