package UTS.utsjuga;

public class Motor extends Kendaraan {
    String tipeMotor;

    public void setTipe(String tipeMotor) {
        this.tipeMotor = tipeMotor;
    }

    public String getTipe() {
        return tipeMotor;
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("== INFO MOTOR ==");
        super.tampilkanInfo();
        System.out.println("Tipe Motor: " + getTipe());
        System.out.println();
    }
}
