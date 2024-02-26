/**
 * Buku20
 */
public class Buku20 {
String judul, pengarang;
int halaman, stok, harga;
void tampilInformasi () {
    System.out.println("judul=" + judul);
    System.out.println("pengarang" +pengarang);
    System.out.println("jumlah halaman" + halaman);
    System.out.println("sisa stok" +stok);
    System.out.println("harga =" +harga);
    }
    void terjual(int jml) {
        if (jml <= stok) {
            stok -= jml;
            System.out.println("Buku terjual: " + jml);
        } else {
            System.out.println("Stok tidak cukup! Hanya " + stok + " buku yang terjual.");
        }
    }
    
    void restock (int jml) {
        stok += jml;
    }

void gantiHarga(int hrg) {
    
}
    public static void main(String[] args) {
        
    }
}