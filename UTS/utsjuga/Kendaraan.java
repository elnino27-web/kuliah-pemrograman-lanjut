package UTS.utsjuga;

public class Kendaraan {
    private String merek, model;
    private int tahunProduksi;
    private double harga;

    public void setKendaraan(String merek, String model, int tahunProduksi, double harga) {
        this.merek = merek;
        this.model = model;
        this.tahunProduksi = tahunProduksi;
        this.harga = harga;
    }

    public String getMerek() {
        return merek;
    }

    public String getModel() {
        return model;
    }

    public int getTahunProduksi() {
        return tahunProduksi;
    }

    public double getHarga() {
        return harga;
    }

    public void tampilkanInfo() {
        System.out.println("Merek: " + getMerek());
        System.out.println("Model: " + getModel());
        System.out.println("Tahun: " + getTahunProduksi());
        System.out.println("Harga: " + getHarga());
    }
}
