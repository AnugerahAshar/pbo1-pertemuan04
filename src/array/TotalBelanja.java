package array;

public class TotalBelanja {
    public static void main(String[] args) {
        double[][] belanja = new double[5][30];

        belanja[0][1] = 2000;
        belanja[0][2] = 35000;
        belanja[0][3] = 9000;


        belanja[1][1] = 20000;
        belanja[1][2] = 1200;
        belanja[1][3] = 8500;

        for (int i=0; i<=1; i++){
            int total = 0;
            int stat = 0;
            for (int j=0; j<=3; j++){
                total += belanja[i][j];
            }

            stat = i + 1;
            System.out.println("total belanja " + stat + ": " + total);
        }
    }
}
