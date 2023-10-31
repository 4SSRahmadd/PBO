public class Main {
    public static void main(String[] args) {
        String Sensus = "Dispenduk", KTP = "Kecamatan DAU";
        BuatKTP ktp = new BuatKTP( "Yaasir", "O",17,"Laki-Laki");
        Peserta peserta = new Peserta(ktp);
        System.out.println("Sensus = "+Sensus+"\nKTP ="+KTP);
        System.out.println("Nama = "+peserta.getKTP().Nama()+"\nGolongan Darah = "+peserta.getKTP().GolonganDarah()+ "\nUmur = "+peserta.getKTP().Umur()+ "\nJenis Kelamin = "+peserta.getKTP().jenisKelamin());

    }
}