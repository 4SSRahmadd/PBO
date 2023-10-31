import java.lang.Math;
public class Persegi implements BangunDatar {
    public int sisi;

    @Override
    public double luas() {
        return Math.pow(this.sisi, 2);
    }

    @Override
    public double keliling(){
        return 4 * this.sisi;
    }
}
