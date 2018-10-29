package pbo2.pkg10117045.latihan61.bangunruang;

import java.text.DecimalFormat;

/**
 *
 * NAMA                 : Alif Hermawan 
 * Kelas                : PBO-2 
 * NIM                  : 10117045 
 * Deskripsi Program    : Program ini berisi perintah untuk menampilkan besar
 * volume bola basket, tabung, dan kerucut
 */
public class Tester {

    public static void main(String[] args) {
        //menghilangkan angka dibelakang koma
        DecimalFormat twoDForm = new DecimalFormat("#.#");
        DecimalFormat twoDForm1 = new DecimalFormat("#");
        DecimalFormat twoDForm2 = new DecimalFormat("#");

        BolaBasket bol = new BolaBasket();
        bol.setJariJari(7);

        Tabung tab = new Tabung();
        tab.setJariJari(10);
        tab.setTinggi(21);

        Kerucut ker = new Kerucut();
        ker.setJariJari(14);
        ker.setTinggi(9);

        System.out.println("Volume Bola : " + twoDForm.format(bol.volume()) + " cm3");
        System.out.println("Volume tabung : " + twoDForm1.format(tab.volume()) + " cm3");
        System.out.println("Volume kerucut : " + twoDForm2.format(ker.volume()) + " cm3");
    }

}
