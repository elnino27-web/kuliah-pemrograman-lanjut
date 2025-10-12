public class Main {
    public static void main(String[] args) {
        RumusPersegi rp = new RumusPersegi();
        RumusLingkaran rl = new RumusLingkaran();
        Mobil mb = new Mobil("Toyota", "Avanza", 2022);

        System.out.println("Luas Persegi adalah: " + rp.luasPersegi(4));
        System.out.println("Keliling Persegi adalah: " + rp.kelilingPersegi(6));

        System.out.println("Luas Lingkaran adalah: " + rl.luasLingkaran(6));

        System.out.println("Mobilnya bermerek " + mb.merek + " model " + mb.model + " keluaran tahun " + mb.tahun);
    }
}