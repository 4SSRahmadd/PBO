class Hero {
    private String Nama;
    private String Jenis;
    private String Asal;
    private String Kuad;
    private String Maem;
    private String Ikat;

    public Hero(String Nama) {
        this.Nama = Nama;
        this.Jenis = "Shinobi";
    }
    
    public Hero(String Nama, String Asal) {
        this.Nama = Nama;
        this.Jenis = "Shinobi";
        this.Asal = Asal;
    }
    
    public Hero(String Nama, String Asal, String Kuad){
        this.Nama = Nama;
        this.Jenis = "Shinobi";
        this.Asal = Asal;
        this.Kuad = Kuad;
    }
    
    public Hero (String Nama, String Asal, String Kuad, String Ikat){
        this.Nama = Nama;
        this.Jenis = "Shinobi";
        this.Asal = Asal;
        this.Kuad = Kuad;
        this.Ikat = Ikat;
    }
    
    public Hero(String Nama, String Asal, String Kuad, String Ikat, String Maem){
        this.Nama = Nama;
        this.Jenis = "Shinobi";
        this.Asal = Asal;
        this.Kuad = Kuad;
        this.Ikat = Ikat;
        this.Maem = Maem;
    }
    
    public void namaOrang(){
        System.out.println("Nama    :"+this.Nama);
        System.out.println("Jenis   :"+this.Jenis);
        System.out.println("Desa    :"+this.Asal);
        System.out.println("Power   :"+this.Kuad);
        System.out.println("Ikat Kepala :"+this.Ikat);
        System.out.println("Makanan :"+this.Maem);
    }
}
public class Keg1a {
    public static void main(String[] args) {
        Hero oiya = new Hero("Naruto", "Konoadoh", "Rasengan", "Kruwel", "Ramen" );  
        oiya.namaOrang();      
    }
}