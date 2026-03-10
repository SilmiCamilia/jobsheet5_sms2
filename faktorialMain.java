import java.util.Scanner;

public class faktorialMain {
    public static void main(String[] args) {
        Scanner ooo = new Scanner(System.in);
        System.out.print("Masukkan nilai = ");
        int nilai = ooo.nextInt();
        faktorial fk = new faktorial();
        System.out.println("Nilai faktorial "+nilai+"menggunakan BF = "+fk.faktorialBF(nilai));
        System.out.println("Nilai faktorial "+nilai+"menggunakan DC = "+fk.faktorialDC(nilai));
    }
    
}
