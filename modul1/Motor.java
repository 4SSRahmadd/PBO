import java.util.Scanner;
public class Motor {
    private String CC;
    private String Merk;
    private String BBM;
    private String Tipe;

    Scanner input = new Scanner(System.in);
    public void masuk() {
        System.out.println("Data MOTORmu\t:");
    }
public void setMerk() {
        System.out.print("Inputkan Merk mu bro\t:");
        this.Merk = input.nextLine();
    }

    public String getMerk() {
        return Merk;
    }
    public void setCC() {
        System.out.print("Inputkan CC mu bro\t:");
        this.CC = input.nextLine();
    }

    public String getCC() {
        return CC;
    }

    
    public void setBBM() {
        System.out.print("Inputkan BBM mu bro\t:");
        this.BBM = input.nextLine();
    }

    public String getBBM() {
        return BBM;
    }

    public void setJenis() {
        System.out.print("Inputkan jenis motor mu bro\t:");
        input.nextLine();
    }

    public String getJenis() {
        return Merk;
    }
    public static void main(String[] args) {
        Motor user1 = new Motor();
        user1.masuk();
        user1.setMerk();
        user1.setCC();
        user1.setBBM();
        user1.setJenis();
        
        System.out.println("\nData anda telah terdaftar\n");
        System.out.println("Berikut Username dan Password anda\n");
        System.out.println("Nama motor\t: " + user1.getMerk());
        System.out.println("CC motormu\t: " + user1.getCC());
        System.out.println("BBM yang kamu gunakan\t: " + user1.getBBM());

}
}