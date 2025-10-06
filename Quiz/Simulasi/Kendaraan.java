class Kendaraan {
    public static void main(String[] args) {
        Mobil mb = new Mobil();
        mb.info();
        mb.start();
    }
    void info() {
        System.out.println("Ini adalah sebuah kendaraan");
    }
}

class Mobil extends Kendaraan {
    void start() {
        System.out.println("Mobil telah dinyalakan");
    }
}