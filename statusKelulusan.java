import java.util.Scanner;
public class statusKelulusan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("====== INPUT DATA MAHASISWA ======");
        System.out.print("NAMA\t: ");
        String nama = sc.nextLine();
        System.out.print("NIM\t: ");
        String nim = sc.nextLine();

        // memasukkan mata kuliah 1 
        System.out.println("\n----- Mata Kuliah 1\t: Algoritma dan Pemrograman -----");
        System.out.print("Masukkan nilai UTS\t: ");
        int uts1 = sc.nextInt();
        System.out.print("Masukkan nilai UAS\t: ");
        int uas1 = sc.nextInt();
        System.out.print("Masukkan nilai Tugas\t: ");
        int tugas1 = sc.nextInt();
        
        // memasukkan mata kuliah 2
        System.out.println("\n----- Mata Kuliah 2\t: Struktur Data -----");
        System.out.print("Masukkan nilai UTS\t: ");
        int uts2 = sc.nextInt();
        System.out.print("Masukkan nilai UAS\t: ");
        int uas2 = sc.nextInt();
        System.out.print("Masukkan nilai Tugas\t: ");
        int tugas2 = sc.nextInt();


        sc.close();
    }
}

