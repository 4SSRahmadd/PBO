import java.util.Scanner;
public class konversiWaktuOO {
    private int bulan;
    private int hari;
    private int jam;
    private int menit;
    private int detik;
Scanner input = new Scanner(System.in);
public void setBulan() {
    int Bulan;
    System.out.print("Masukan Jumlah Bulan : ");
    Bulan = input.nextInt();
    this.bulan = Bulan;
}
public int getBulan() {
    return bulan;
}

public void setHari(int hari) {
    this.hari = hari * 30;
}
public int getHari() {
    return hari;
}

public void setJam(int jam) {
    this.jam = jam * 24;
}
public int getJam() {
    return jam;
}
public void setMenit(int menit) {
    this.menit = menit * 60;
}
public int getMenit() {
    return menit;
}
public void setDetik(int detik) {
    this.detik = detik * 60;
}
public int getDetik() {
    return detik;
}
public static void main(String[] args) {
    konversiWaktuOO ngubah = new konversiWaktuOO();
    ngubah.setBulan();
    System.out.println("Di Dalam " + ngubah.getBulan() + " Bulan");
    ngubah.setHari(ngubah.getBulan());
    System.out.println("Terdapat " + ngubah.getHari() + " Hari");
    ngubah.setJam(ngubah.getHari());
    System.out.println("Terdapat " + ngubah.getJam() + " Jam");
    ngubah.setMenit(ngubah.getJam());
    System.out.println("Terdapat " + ngubah.getMenit() + " Menit");
    ngubah.setDetik(ngubah.getMenit());
    System.out.println("Terdapat " + ngubah.getDetik() + " Detik");
}
}