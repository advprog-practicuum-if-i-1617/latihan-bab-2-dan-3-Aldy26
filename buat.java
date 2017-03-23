package angka.terbilang.angka;

public class buat {

    public static void keDigit(String input) {
        String[] satuan = {"nol", "satu", "dua", "tiga", "empat", "lima", "enam", "tujuh", "delapan", "Sembilan", "puluh", "ratus"};
        for (int i = 0; i <= 100; i++) {

            String hasil;
            boolean cari;
            int ratus, puluh, satuann;
            ratus = (i % 1000) / 100;
            puluh = (i % 100) / 10;
            satuann = i % 10;
            if (puluh == 1) {
                if (satuann == 1) {
                    hasil = "sebelas";
                } else if (satuann == 0) {
                    hasil = "sepuluh";
                } else {
                    hasil = (satuan[satuann] + " #belas");
                }

            } else if (i == 100) {
                hasil = ("seratus");
            } else if (i >= 20 && satuann == 0) {
                hasil = (satuan[puluh] + " #puluh");
            } else if (i < 10) {
                hasil = satuan[satuann];
            } else {
                hasil = (satuan[puluh] + "puluh" + satuan[satuann]);
            }
            cari = alatCari(hasil, input);
            if (cari) {
                System.out.println(i);
                i = 1001;
            }

        }
    }

    static boolean alatCari(String a, String b) {
        int pnjng1, pnjng2, indks1, indks2, indks3;
        String data, dicari;
        data = a.toLowerCase();
        dicari = b.toLowerCase();
        boolean ketemu, ditemukan = false;
        pnjng1 = a.length();
        pnjng2 = b.length();
        indks1 = 0;
        ketemu = false;
        while ((indks1 < pnjng1) && !ketemu) {
            if (pnjng2 > (pnjng1 - indks1)) {
                break;
            }
            indks3 = indks1;
            ketemu = true;
            for (indks2 = 0; indks2 < pnjng2; indks2++) {
                if (data.charAt(indks3) == dicari.charAt(indks2)) {
                    indks3++;
                } else {
                    ketemu = false;
                    break;
                }
            }

            if (ketemu) {
                ditemukan = true;
            } else {
                ditemukan = false;
                indks1++;
            }

        }
        return ditemukan;

    }
}
