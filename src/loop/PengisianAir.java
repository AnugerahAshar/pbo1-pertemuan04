package loop;

public class PengisianAir {
    public static void main(String[] args) {
        int jumlahTangki = 3;
        int jumlahAir = 0;
        int tangkiPenuh = 225;

        for (jumlahAir = 0; jumlahAir < jumlahTangki*tangkiPenuh; jumlahAir++){
            System.out.println("Sedang mengisi tangki..");
        }

        System.out.println("Total tangki        : " + jumlahTangki);
        System.out.println("Air yang dibutuhkan : " + jumlahAir + "ml");
    }
}
