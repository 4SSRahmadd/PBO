class Hero {
    private String Nama;
    private String Jenis;
    public void namaHero(String Nama){
        this.Nama = "Naruto";
        this.Jenis = "Shinobi";
        System.out.println("Nama    :"+this.Nama);
        System.out.println("Jenis   :"+this.Jenis);
    }
}
class Desa extends Hero {
    private String Asal;
    public void namaDesa(String Asal){
        this.Asal = "Konoadoh";
        System.out.println("Desa    :"+this.Asal);
    }
}
class Power extends Hero {
    private String Kuad;
    public void namaPower(String Kuad){
        this.Kuad = "Rasengan";
        System.out.println("Power   :"+this.Kuad);
    }
}
class Lambang extends Hero{
    private String Ikat;
    public void namaLambang(String Ikat){
        this.Ikat = "Kruwel";
        System.out.println("Ikat Kepala :"+this.Ikat);
    }
}
class Makan extends Hero{
    private String Maem;
    public void namaMaem(String Maem){
        this.Maem = "Ramen";
        System.out.println("Makanan :"+this.Maem);
    }
}
public class Kegiatan1a {
    public static void main(String[] args) {
        
    Hero oyi = new Hero(); 
    oyi.namaHero("Nama");
    Desa kono = new Desa();
    kono.namaDesa("Desa");
    Power wiw = new Power();
    wiw.namaPower("Kuad");
    Lambang nyoh = new Lambang();
    nyoh.namaLambang("Ikat");
    Makan lhap = new Makan();
    lhap.namaMaem("Maem");
}
}