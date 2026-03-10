import java.util.Scanner;

public class nilaiMahasiswaMain {
    public static void main(String[] args) {

        Scanner maha = new Scanner(System.in);
        nilaiMahasiswa mhs = new nilaiMahasiswa();

        System.out.print("Masukkan jumlah mahasiswa = ");
        int jmlmhs = maha.nextInt();
        maha.nextLine(); // membersihkan enter

        String nama[] = new String[jmlmhs];
        int uts[] = new int[jmlmhs];
        int uas[] = new int[jmlmhs];

        for(int i = 0; i < jmlmhs; i++){

            System.out.println("\nMahasiswa ke-" + (i+1));

            System.out.print("Nama = ");
            nama[i] = maha.nextLine();

            System.out.print("Nilai UTS = ");
            uts[i] = maha.nextInt();

            System.out.print("Nilai UAS = ");
            uas[i] = maha.nextInt();
            maha.nextLine(); // membersihkan enter sebelum ulang loop
        }

        System.out.println("\n=== DATA MAHASISWA ===");
        for(int i = 0; i < jmlmhs; i++){
            System.out.println("Mahasiswa ke-" + (i+1));
            System.out.println("Nama      = " + nama[i]);
            System.out.println("Nilai UTS = " + uts[i]);
            System.out.println("Nilai UAS = " + uas[i]);
            System.out.println("---------------------");
        }

        System.out.println("Nilai UTS tertinggi = " + mhs.highest(uts,0,uts.length-1));
        System.out.println("Nilai UTS terendah  = " + mhs.lowest(uts,0,uts.length-1));
        System.out.println("Rata-rata nilai UAS = " + mhs.rataUAS(uas));
    }
}