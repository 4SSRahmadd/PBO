import java.util.InputMismatchException;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        String alamat, pilih;
        int luasTanah, panjangTanah, index = 0;
        boolean sip = true;
        String[] data = new String[2];
        Scanner input = new Scanner(System.in);
        DinasPertanahan iyo = new DinasPertanahan();

        do {
            try {
                System.out.println("\n=== Data-" + (index + 1) + " ===");
                // Alamat
                System.out.print("Masukan Alamat : ");
                alamat = input.next();
                iyo.setAlamat(alamat);

                // Luas Tanah
                System.out.print("Masukan Luas Tanah : ");
                luasTanah = input.nextInt();
                iyo.setLuasTanah(luasTanah);

                // Panjang Tanah
                System.out.print("Masukan Panjang Tanah : ");
                panjangTanah = input.nextInt();
                iyo.setPanjangTanah(panjangTanah);

                data[index] = iyo.display();
                System.out.print("Apakah Ingin Melanjutkan Program (Y/N) : ");
                pilih = input.next();
                if (pilih.compareTo("N") == 0)
                    sip = false;
                index++;
            } catch (ArrayIndexOutOfBoundsException error) {
                System.out.println("\nError = Index Array Melebihi Batas");
                sip = false;
            } catch (InputMismatchException error) {
                System.out.println("\nError = Masukan Tidak Cocok Dengan Tipe Data");
                sip = false;
            }

        } while (sip);
        for (int i = 0; i < index; i++) {
            System.out.println("\n=== Data " + (i + 1) + " ===");
            System.out.println(data[i]);
        }

    }
}