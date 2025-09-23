public class Produk {
    String nama, tipe;
    int harga;

    public Produk(String nama, String tipe, int harga) {
        this.nama = nama;
        this.tipe = tipe;
        this.harga = harga;
    }

    public void tampilProduk() {
        System.out.println("Nama Produk : " + nama);
        System.out.println("Tipe        : " + tipe);
        System.out.println("Harga       : Rp" + String.format("%,d", harga).replace(',', '.'));

    }
}