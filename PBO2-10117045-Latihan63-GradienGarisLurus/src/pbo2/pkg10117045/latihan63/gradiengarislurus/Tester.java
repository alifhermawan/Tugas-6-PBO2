package pbo2.pkg10117045.latihan63.gradiengarislurus;

/**
 *
 * NAMA                 : Alif Hermawan 
 * Kelas                : PBO-2 
 * NIM                  : 10117045 
 * Deskripsi Program    : Program ini berisi perintah untuk menampilkan besar
 * gradien suatu garis lurus
 */
public class Tester {

    public static void main(String[] args) {

        Koordinat kor = new Koordinat(2, 10, 5, 7);
        Koordinat kor1 = new Koordinat(5, 1, 3, 12);

        System.out.println("Garis yang melalui titik (" + kor.getX1() + ", " + kor.getY1()
                + ") dan  (" + kor.getX2() + ", " + kor.getY2() + ") memiliki gradien sebesar "
                + kor.hitungGradien() + "\n");

        System.out.println("Garis yang melalui titik (" + kor1.getX1() + ", " + kor1.getY1()
                + ") dan  (" + kor1.getX2() + ", " + kor1.getY2() + ") memiliki gradien sebesar "
                + kor1.hitungGradien() + "\n");

    }

}
