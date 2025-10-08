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

         // menghitung nilai akhir dan rata-rata
        double nilaiAkhir1 = (0.3 * uts1) + (0.4 * uas1) + (0.3 * tugas1);
        double nilaiAkhir2 = (0.3 * uts2) + (0.4 * uas2) + (0.3 * tugas2);
        double rataRata = (nilaiAkhir1 + nilaiAkhir2) / 2;

        // menenentukan status kelulusan
        String statusAlgoritmaDanPempograman = (nilaiAkhir1 >= 60) ? "LULUS" : "TIDAK LULUS";
        String statusStrukturData = (nilaiAkhir2 >= 60) ? "LULUS" : "TIDAK LULUS";
        String statusSemester = (rataRata >= 70) ? "LULUS (rata-rata >70)" : "TIDAK LULUS (rata-rata <70)";

        // mengkonversi nilai akhir ke dalam skala huruf
        String huruf1, huruf2;

        if (nilaiAkhir1 >= 80) { huruf1 = "A";
        } else if (nilaiAkhir1 >= 73) { huruf1 = "B+";
        } else if (nilaiAkhir1 >= 65) { huruf1 = "B";
        } else if (nilaiAkhir1 >= 60) { huruf1 = "C+";
        } else if (nilaiAkhir1 >= 50) { huruf1 = "C";
        } else if (nilaiAkhir1 >= 39) { huruf1 = "D";
        } else { huruf1 = "E";
        }
        if (nilaiAkhir2 >= 80) { huruf2 = "A";
        } else if (nilaiAkhir2 >= 73) { huruf2 = "B+";
        } else if (nilaiAkhir2 >= 65) { huruf2 = "B";
        } else if (nilaiAkhir2 >= 60) { huruf2 = "C+";
        } else if (nilaiAkhir2 >= 50) { huruf2 = "C";
        } else if (nilaiAkhir2 >= 39) { huruf2 = "D";
        } else { huruf2 = "E";
        }
        sc.close();
    }
}

