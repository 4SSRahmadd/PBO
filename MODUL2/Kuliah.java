import java.util.Scanner;

public class Kuliah {
    private int NilaiProgdas;
    private int NilaiKalkulus;
    private int NilaiOrkom;
    private double Hasil;

    Scanner input = new Scanner(System.in);

    public void setNilaiProgdas() {
        System.out.print("Nilai Progdas\t:");
        this.NilaiProgdas = input.nextInt();
    }

    public int getNilaiProgdas() {
        return NilaiProgdas;
    }

    public void setNilaiKalkulus() {
        System.out.print("Nilai Kalkulus\t:");
        this.NilaiKalkulus = input.nextInt();
    }

    public int getNilaiKalkulus() {
        return NilaiKalkulus;
    }

    public void setNilaiOrkom() {
        System.out.print("Nilai Orkom\t:");
        this.NilaiOrkom = input.nextInt();
    }

    public int getNilaiOrkom() {
        return NilaiOrkom;
    }

    public double hitungRata() {
        double P, K, O;
        Kuliah user1 = new Kuliah();
        user1.setNilaiProgdas();
        user1.setNilaiKalkulus();
        user1.setNilaiOrkom();
        P = user1.getNilaiProgdas();
        K = user1.getNilaiKalkulus();
        O = user1.getNilaiOrkom();
        this.Hasil = (P + K + O) / 3;
        return this.Hasil;
    }

    public void cekNilai() {
        Kuliah rata = new Kuliah();
        double Y = rata.hitungRata();
        if (Y >= 70) {
            System.out.println("Selamat Anda LULUS, dengan nilai\t:" + Y );
        } else {
            System.out.println("Anda belum Beruntung Coba Lagi" + "\nNilai anda sekian :" + Y);
        }
    }

    public static void main(String[] args) {
        Kuliah hasil = new Kuliah();
        hasil.cekNilai();
    }

}
