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

        // implementasi nested if untuk status kelulusan
        String status_semester;

        // kondisi luar (syarat 1): jika kedua mata kuliah lulus
        if (statusAlgoritmaDanPempograman.equals("LULUS") && statusStrukturData.equals("LULUS")) {
            //equals untuk membandingkan string

            // kondisi dalam (syarat 2): cek rata-rata 
            if (rataRata >= 70) { status_semester = "LULUS SEMESTER"; // syarat 1 dan 2 terpenuhi
            } else { status_semester = "TIDAK LULUS SEMESTER"; // syarat 1 terpenuhi, syarat 2 tidak terpenuhi
            }

        } else {  // jika salah satu atau kedua mata kuliah tidak lulus (syarat 1 tidak terpenuhi)
            status_semester = "TIDAK LULUS SEMESTER (satu/kedua mata kuliah tidak lulus)"; 
        }

        //output
        System.out.println("\n====== HASIL PENILAIAN  AKADEMIK ======");
        System.out.println("Nama\t\t: " + nama);
        System.out.println("NIM\t\t: " + nim);
        System.out.println("\nMata Kuliah 1\t\tUTS\t UAS\t Tugas\t Nilai Akhir\t Nilai Huruf\t Status");
        System.out.println("----------------------------------------------------------------------------------------------");

        // menampilkan hasil untuk setiap mata kuliah 
        // String.format untuk membatasi angka desimal menjadi 2 angka di belakang koma

        System.out.println("Algoritma dan Pemrograman\t " + uts1 + "\t " + uas1 + "\t " + tugas1 + "\t " + String.format("%.2f", nilaiAkhir1) + "\t\t " + huruf1 + "\t\t " + statusAlgoritmaDanPempograman);
        System.out.println("Struktur Data\t\t\t " + uts2 + "\t " + uas2 + "\t " + tugas2 + "\t " + String.format("%.2f", nilaiAkhir2) + "\t\t " + huruf2 + "\t\t " + statusStrukturData);

        //menampilkan rata-rata dari nilai kedua mata kuliah
        System.out.println("\nRata-rata nilai akhir kedua mata kuliah: " + String.format("%.2f", rataRata));
        //menampilkan status kelulusan berdasarkan rata-rata nilai akhir
        System.out.println("Status kelulusan semester: " + status_semester);

        sc.close();
    }
}

