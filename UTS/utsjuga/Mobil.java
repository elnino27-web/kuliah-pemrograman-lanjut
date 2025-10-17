package UTS.utsjuga;

public class Mobil extends Kendaraan {
    int jumlahPintu;

    public void setPintu(int jumlahPintu) {
        this.jumlahPintu = jumlahPintu;
    }

    public int getPintu() {
        return jumlahPintu;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("== INFO MOBIL ==");
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + getPintu());
        System.out.println();
    }
}
