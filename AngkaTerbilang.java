package angka.terbilang;

import java.util.Scanner;

public class AngkaTerbilang {

    static String[] alfabet = {"", "Satu", "Dua", "Tiga", "empat", "Lima", "Enam", "Tujuh", "Delapan", "Sembilan", "Sepuluh", "Sebelas"};

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukan Bilangan yang ingin diubah (1-1000) : ");
        System.out.println(new AngkaTerbilang().angkaTerbilangg(sc.nextInt()));
    }

    public static String angkaTerbilangg(int angka) {
        if (angka < 12) 
            return alfabet[angka];
        
        if (angka >= 12 && angka <= 19) 
            return alfabet[angka % 10] + " belas";
        
        if (angka >=20&&angka<=199)
            return angkaTerbilangg (angka /10)+ " Puluh" + alfabet[angka % 10] ;
        if (angka >=200 && angka <=999)
            return angkaTerbilangg(angka/100)+ " ratus"+ angkaTerbilangg(angka%100);
        if (angka >1000 && angka <=1999)
            return "seribu "+ angkaTerbilangg(angka %1000);
        return "";
    }
}
