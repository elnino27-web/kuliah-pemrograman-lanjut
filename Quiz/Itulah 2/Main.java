public class Main {
    public static void main(String[] args) {
        Pasien p = new Pasien();
        p.ucapanSelamatDatang();

        System.out.println();
        p.pasien(001, "Akmal", 730704002, "L");

        System.out.println();
        p.cekUmur("Akmal", 19);

        System.out.println();
        Obat ob = new Obat();
        ob.obat();

        System.out.println();
        RekamMedis RM = new RekamMedis();
        RM.rekamMedis();
    }
}