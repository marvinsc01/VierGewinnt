public class test3 {
    public static void main(String []args){

        int x=8;
        int y=8;

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
            int a = 2;
            int b = 2;
            Schiff[a][b] = 0;
        }
        System.out.println();

        for(int spalte = 0; spalte < y; spalte++)
        {
            for(int row = 0; row < x; row++)
            {
                if(Schiff[spalte][row] == -1)
                {
                    System.out.print(" " + "|");
                }

                if(Schiff[spalte][row] == 0)
                {
                    System.out.print("X" + "|");
                }

            }
            System.out.println("");
        }

    }
}
