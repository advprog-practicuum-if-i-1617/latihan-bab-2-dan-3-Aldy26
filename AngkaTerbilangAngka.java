package angka.terbilang.angka;
import java.util.Scanner;
public class AngkaTerbilangAngka {

    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        buat bwt=new buat();
        System.out.print("masukan terbilang : ");
        buat.keDigit(sc.next());
    }
    
}
