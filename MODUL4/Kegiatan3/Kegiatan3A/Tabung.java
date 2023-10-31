public class Tabung extends Lingkaran {
    public int tinggi;
    public double getVolume() {
        return(super.luas()* this.tinggi);
    }
}
