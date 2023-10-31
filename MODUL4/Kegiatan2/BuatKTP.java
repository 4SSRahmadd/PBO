public class BuatKTP {
    private String Nama;
    private String GolonganDarah;
    private int Umur;
    private String jenisKelamin;

    public BuatKTP(String Nama, String golonganDarah, int Umur, String jenisKelamin) {
        this.Nama = Nama;
        this.GolonganDarah = golonganDarah;
        this.Umur = Umur;
        this.jenisKelamin = jenisKelamin;
    }

    public String Nama() {
        return Nama;
    }

    public String GolonganDarah() {
        return GolonganDarah;
    }

    public int Umur() {
        return Umur;
    }

    public String jenisKelamin() {
        return jenisKelamin;
    }
}