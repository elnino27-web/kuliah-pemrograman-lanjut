public class Pasien {
    int no_RM, NIK;
    String nama, jenisKelamin;

    public void pasien(int no_RM, String nama, int NIK, String jenisKelamin){
        this.no_RM = no_RM;
        this.nama = nama;
        this.NIK = NIK;
        this.jenisKelamin = jenisKelamin;

        System.out.println("Info Pasien :");
        System.out.println("Nomor RM      : " + no_RM);
        System.out.println("Nama          : " + nama);
        System.out.println("NIK           : " + NIK);
        System.out.println("Jenis Kelamin : " + jenisKelamin);
    }

    public void ucapanSelamatDatang(){
        System.out.println("=== Selamat Datang di Sini===");
    }

    public void cekUmur(String nama, int umur){
        System.out.print("Pasien ");
        if(umur >= 50){
            System.out.println(nama + " sudah tua");
        } else {
            System.out.println(nama + " masih muda");
        }
    }
    
}
