import java.util.Scanner;
public class test2 {
    public static void main(String[] args) {
        int x=8;
        int y=8;

        Scanner scan = new Scanner(System.in);
        System.out.println("X-Koordinate eingeben");
        Integer xkoordinate = scan.nextInt();
        System.out.println("Y-Koordinate eingeben");
        Integer ykoordinate = scan.nextInt();

        int [][] Schiff = new int [x][y];

        for(int spalte = 0; spalte < y; spalte++)
        {
            for(int row = 0; row < x; row++)
            {
                Schiff   [spalte][row] = -1;
            }
        }
        System.out.println("");




        for(int c = 0; c < x; c++)
        {
            int a = (int) (Math.random()*xkoordinate);
            int b = (int) (Math.random()*ykoordinate);
            Schiff[a][b] = 0;
        }
        System.out.println();

        for(int spalte = 0; spalte < y; spalte++)
        {
            for(int row = 0; row < x; row++)
            {
                if(Schiff[spalte][row] == -1)
                {
                    System.out.print("0" + " ");
                }

                if(Schiff[spalte][row] == 0)
                {
                    System.out.print("X" + " ");
                }

            }
            System.out.println("");
        }

        System.out.println("<---------Gegner---------->");
        int x1=8;
        int y1=8;

        int [][] Feind = new int [x1][y1];

        for(int spalte = 0; spalte < y1; spalte++)
        {
            for(int row = 0; row < x1; row++)
            {
                Feind   [spalte][row] = -1;
            }
        }
        System.out.println("");

        for(int k = 0; k < x1; k++)
        {
            int a = (int) (Math.random()*x1);
            int b = (int) (Math.random()*y1);
            Feind[a][b] = 0;
        }
        System.out.println();

        for(int spalte = 0; spalte < y1; spalte++)
        {
            for(int row = 0; row < x1; row++)
            {
                if(Feind[spalte][row] == -1)
                {
                    System.out.print("0" + " ");
                }

                if(Feind[spalte][row] == 0)
                {
                    System.out.print("X" + " ");
                }

            }
            System.out.println("");
        }
    }

}