public class Main {
    public static void main(String[] args) {
        Produk produk1 = new Produk("Laptop Acer", "Aspire A14-51GM", 10650000);
        Produk produk2 = new Produk("HP Xiaomi", "Redmi Note 9", 2600000);

        Keranjang keranjang1 = new Keranjang("Akmal");

        System.out.println();
        keranjang1.tambahProduk(produk1);
        System.out.println();
        keranjang1.tambahProduk(produk2);
    }
}