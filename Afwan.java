package operator;
import java.util.*;
public class Kalkulator_sederhana {
    public static void main(String[] args) {
        double a,b, hasil;
        char Operator;
        
        Scanner Input = new Scanner(System.in);
        System.out.print("Masukkan Nilai a = ");
        a = Input.nextDouble();
        
        System.out.print("Masukkan Operator = ");
        Operator = Input.next().charAt(0);
        
        System.out.print("Masukkan Nilai b = ");
        b = Input.nextDouble();
        
        System.out.println("Input User :" +a+ " " +Operator+ " " +b);
        
        if ( Operator == '+'){
            hasil = a + b;
            System.out.println("Hasil = " +hasil);
        } else if (Operator == '-'){
            hasil = a - b;
            System.out.println("Hasil = " +hasil);
        } else if (Operator == '*'){
            hasil = a * b;
            System.out.println("Hasil = " +hasil);
        } else if (Operator == '/'){
            if (b == 0) {
                System.out.println("Setiap Pembagian Dengan Nol Akan Menghasilkan Nilai Tak Hingga!!");
            } else {
                hasil = a / b;
            System.out.println("Hasil = " +hasil);
            }
        } else {
            System.out.println("Operator Tidak Ditemukan!!");
        }
    }
}
