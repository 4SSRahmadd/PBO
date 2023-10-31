import java.util.Scanner;
public class konversiWaktu {
    private int hari,jam,menit,detik;
    public void hari(int bulan){
        int cara = bulan * 30;
        System.out.println("\nDalam " + bulan + " bulan, terdapat " + cara + " hari");
    }
    public void jam (int bulan){
        int cara = bulan * 30 * 24;
        System.out.println("Dalam " + bulan + " bulan, terdapat " + cara+ " jam");
    }
    public void menit (int bulan){
        double cara = bulan * 30 * 24 * 60;
        System.out.println("Dalam " + bulan + " bulan, terdapat " + cara+ " menit"); 
    }
    public void detik(int bulan){
        double cara = bulan * 30 * 24 * 60 * 60;
        System.out.println("Dalam " + bulan + " bulan, terdapat " + cara+ " detik");
    }
public static void main(String[] args) {
    konversiWaktu ngubah = new konversiWaktu();
    Scanner input = new Scanner(System.in);
    System.out.print("Bulan ke-");
    int bulan = input.nextInt();
    ngubah.hari(bulan);
    ngubah.jam(bulan);
    ngubah.menit(bulan);
    ngubah.detik(bulan);
}
}
