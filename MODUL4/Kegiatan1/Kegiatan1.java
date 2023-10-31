public class Kegiatan1 {

  public static void main(String[] args) {
    Kerucut bangun1 = new Kerucut();
    Bola bangun2 = new Bola();

    // Luas Kerucut
    bangun1.setLuas(18, 9);
    bangun1.getLuas();

    // Volume Kerucut
    bangun1.setVolume(10, 25);
    bangun1.getVolume();

    // Luas Bola
    bangun2.setLuas(25);
    bangun2.getLuas();

    // Volume Bola
    bangun2.setVolume(25);
    bangun2.getVolume();
  }
}

abstract class BangunRuang {
  abstract void getLuas();
  abstract void getVolume();

}

class Kerucut extends BangunRuang{
  double phi = 3.14;
  double selimut, alas, Luas, Volume;

  void setLuas(double sisi, double jari){
    selimut = phi*jari*sisi;
    alas = phi * Math.pow(jari, 2);
    Luas = alas + selimut;
  }
  @Override
  void getLuas(){
    System.out.println("Luas Kerucut :  "+ Luas);
  }

  void setVolume(double jari, double tinggi){
    Volume = (phi * Math.pow(jari, 2) * tinggi)/3;
  }

  @Override
  void getVolume(){
    System.out.println("Volume Kerucut : "+ Volume);
  }
}

class Bola extends BangunRuang{
    double phi = 3.14;
    double Luas, Volume;

  void setLuas(double jari){
      Luas = 4 * phi * Math.pow (jari,2);
    }
  @Override
  void getLuas(){
    System.out.println("Luas Bola : "+ Luas);
  }

  void setVolume(double jari){
    Volume = (4/3) * phi * Math.pow(jari, 3);
  }
  @Override
  void getVolume(){
    System.out.println("Volume Bola : "+ Volume);
  }
}