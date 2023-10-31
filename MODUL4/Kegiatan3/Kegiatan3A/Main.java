public class Main {
    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jari = 8;
        System.out.println("Luas Lingkaran :"+ lingkaran.luas());
        System.out.println("Keliling Lingkaran :"+ lingkaran.keliling());

        Tabung tabung = new Tabung();
        tabung.jari = 8;
        tabung.tinggi = 10;
        System.out.println("Volume Tabung :"+ tabung.getVolume());

        Persegi persegi = new Persegi();
        persegi.sisi = 5;
        System.out.println("Luas Persegi :"+ persegi.luas());
        System.out.println("Keliling Persegi :"+ persegi.keliling());

        Limas limas = new Limas();
        limas.sisi = 5;
        limas.tinggi = 10;
        System.out.println("Volume Limas :"+ limas.getVolume());
    }
}
