import java.lang.Math;
public class Limas extends Persegi {
    public int tinggi;

    public double getVolume(){
        return (super.luas() * this.tinggi);
    }
}
