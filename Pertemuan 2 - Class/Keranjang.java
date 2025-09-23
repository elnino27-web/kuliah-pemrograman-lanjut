public class Keranjang {
    String pembeli;

    public Keranjang(String pembeli) {
        this.pembeli = pembeli;
    }

    public void tambahProduk(Produk p) {
        System.out.println(pembeli + " menambahkan produk ke keranjang:");
        p.tampilProduk();
    }
}