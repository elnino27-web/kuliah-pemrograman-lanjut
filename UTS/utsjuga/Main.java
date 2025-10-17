package UTS.utsjuga;

public class Main {
    public static void main(String[] args) {
        // ===== MOBIL =====
        Mobil mobil = new Mobil();
        mobil.setKendaraan("Toyota", "Avanza",  2020, 150000000);
        mobil.setPintu(2);

        mobil.tampilkanInfo();

        // ===== MOTOR =====
        Motor motor = new Motor();
        motor.setKendaraan("Honda", "Vario", 2019, 27000000);
        motor.setTipe("Matic");

        motor.tampilkanInfo();
    }
}
