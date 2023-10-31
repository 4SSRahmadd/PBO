import java.lang.Math;
public class Lingkaran implements BangunDatar {
    public int jari;
    
    @Override
    public double luas() {
        // TODO Auto-generated method stub
        return (Math.PI * Math.pow(jari, 2));
    }
    @Override
    public double keliling() {
        // TODO Auto-generated method stub
        return (2 * Math.PI * jari);
    }
}
