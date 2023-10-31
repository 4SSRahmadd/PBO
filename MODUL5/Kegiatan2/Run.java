import java.io.FileWriter;
import java.io.IOException;
import java.io.File;
import java.util.InputMismatchException;
import java.util.Scanner;

class Run {
    public static void main(String[] args) {
        int pilih, pilih2;
        boolean sip = true;

        do {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("=== Menu ===\n1. Create\n2. Show\n0. Exit\n\nMasukan Pilihan Mu :");
                pilih = input.nextInt();
                Run oke = new Run();

                switch (pilih) {
                    case 0:
                        sip = false;
                        System.out.println("Silahkan kembali ke dunia nyata ;)");
                        break;
                    case 1:
                        oke.create();
                        break;
                    case 2:
                        oke.show();
                        break;
                    default:
                        break;
                }

            } catch (InputMismatchException e) {
                System.out.println("Error : Masukan Tidak Cocok Dengan Tipe Data");
            }

            Scanner input = new Scanner(System.in);
            System.out.println("Apakah Ingin Mengulang?\n1. YA\n0. Tidak");
            pilih2 = input.nextInt();
            if (pilih2 == 0) {
                sip = false;
                System.out.println("Terimakasih");
            }

        } while (sip);

    }

    private void create() {
        try {
            Scanner yoi = new Scanner(System.in);
            DinasPertanahan oyi = new DinasPertanahan();
            File file = new File("data.txt");
            FileWriter tampil = new FileWriter(file, true);

            System.out.println("Masukkan Alamat :");
            oyi.setAlamat(yoi.next());

            System.out.println("Masukkan Luas Tanah :");
            oyi.setLuasTanah(yoi.nextInt());

            System.out.println("Masukkan Panjang Tanah  :");
            oyi.setPanjangTanah(yoi.nextInt());

            tampil.write("\nDATAMU GAES\n" + oyi.getAlamat() + "\n" + oyi.getLuasTanah() + "\n" + oyi.getPanjangTanah()
                    + "\n");
            tampil.close();

        } catch (IOException e) {
            // TODO: handle exception
            System.out.println("INI DATAMU  : " + e);

        } finally {
            System.out.println("==========================");
        }

    }

    private void show() {
        try {
            String tampil;
            File data = new File("data.txt");
            Scanner read = new Scanner(data);

            while (read.hasNextLine()) {
                tampil = read.nextLine();
                System.out.println(tampil);
            }

        } catch (IOException e) {
            System.out.println("erorr ges");
        }
    }
}