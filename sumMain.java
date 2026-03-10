import java.util.Scanner;

public class sumMain {
    public static void main(String[] args) {
        Scanner joomlah = new Scanner(System.in);
        System.out.print("Masukkan jumlah elemen = ");
        int elemen = joomlah.nextInt();
        sum sm = new sum(elemen);
        for(int i=0; i<elemen; i++){
            System.out.println("Masukkan keuntungan ke-"+(i+1)+" = ");
            sm.keuntungan[i] = joomlah.nextDouble();
        }
        System.out.print("Total keuntungan menggunakan Bruteforce = "+sm.totalBF());
        System.out.println("Total keuntungan menggunakan Divide and Conquer = "+sm.totalDC(sm.keuntungan, 0, elemen-1));
    }
    
}
