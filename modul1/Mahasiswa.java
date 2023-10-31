import java.util.Scanner;

public class Mahasiswa {
    private String NAMA;
    private String NIM;
    private String password;

    Scanner input = new Scanner(System.in);
    public void daftar() {
        System.out.println("===DAFTAR===");
    }

    public void setNAMA() {
        System.out.print("NAMA\t:");
        this.NAMA = input.nextLine();
    }

    public String getNAMA() {
        return NAMA;
    }

    public void setNIM() {
        do{
        System.out.print("NIM\t:");
            NIM = input.nextLine();
            if (NIM.length() != 15) {
                System.out.println("NIM harus berjumlah 15");
            } else {
                this.NIM = NIM;
            }
        } while (NIM.length() != 15);
    }

    public String getNIM() {
        return NIM;
    }

    public void setPassword() {
        do{
        System.out.print("Password :");
            password = input.nextLine();
            if (password.length() < 8) {
                System.out.println("Password minimal 8 karakter");
            } else {
                this.password = password;
            }
        } while (password.length() < 8);

    }

    public String getPassword() {
        return password;
    }
    
    public static void main(String[] args) {

        Mahasiswa user1 = new Mahasiswa();
        user1.daftar();
        user1.setNAMA();
        user1.setNIM();
        user1.setPassword();

        System.out.println("\nData anda telah terdaftar\n");
        System.out.println("Berikut Username dan Password anda\n");
        System.out.println("Username\t: " + user1.getNIM());
        System.out.println("Password\t: " + user1.getPassword());
    }

}
