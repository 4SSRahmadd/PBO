class Motor {
    private String Tipe;
    protected String BBM;

    public void iniTipe() {
        this.Tipe = "Moge";
        this.BBM = "Pertamax";
        System.out.println("Tipe :" + this.Tipe);
        System.out.println("BBM :" + this.BBM);
    }
}
class R1 extends Motor {
    private int CC;

    public void tampilCC() {
        this.CC = 1000;
        System.out.println("CC :" + this.CC);
    }
}
class Harga extends Motor {
    private int harga = 15000;

    public void iniHarga() {
        super.BBM = "Pertamax";
        System.out.println("Harga BBM ("+ super.BBM +")  :" + this.harga);
    }
}
class Jarak extends Motor {
    private int KM = 14;
    
    public void totalJarak(int harga){ 
        System.out.print("Jarak per KM  :"+ (harga/this.KM));
    }
}
public class Kegiatan1b {
    public static void main(String[] args) {
        Motor ngeng = new Motor(); ngeng.iniTipe();
        R1 R = new R1(); R.tampilCC();
        Harga uang = new Harga(); uang.iniHarga();
        Jarak KM = new Jarak(); KM.totalJarak(15000);   
    }
}