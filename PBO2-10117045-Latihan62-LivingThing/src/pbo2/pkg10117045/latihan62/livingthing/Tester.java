package pbo2.pkg10117045.latihan62.livingthing;

/**
 *
 * NAMA                 : Alif Hermawan 
 * Kelas                : PBO-2 
 * NIM                  : 10117045 
 * Deskripsi Program    : Program ini berisi perintah untuk menampilkan aktivitas
 * dalam kehidupan
 */
public class Tester {

    public static void main(String[] args) {
        Human hum = new Human();
        hum.setNama("Alif Hermawan");
        hum.walk(hum.getNama());
        hum.breath(hum.getNama());
        hum.eat(hum.getNama());
    }
    
}
