package UTS;

// Program Java sederhana menampilkan semua konsep OOP dasar
// Termasuk: class, void, parameter, return, if-else, for, polymorphism, enkapsulasi, pewarisan, konstruktor, operator, dan object

// =================================================================================
// 1. CLASS dan ENCAPSULATION (ENKAPSULASI)
// =================================================================================
// 'class Hewan' adalah kelas induk (superclass/parent class).
// Class ini berfungsi sebagai cetak biru (blueprint) untuk objek-objek hewan.
class Hewan {
    // A. ENKAPSULASI: Atribut dibuat 'private'.
    // Artinya, variabel ini hanya bisa diakses dari dalam kelas Hewan itu sendiri.
    // Ini bertujuan untuk melindungi data.
    private String nama;
    private int umur;

    // =================================================================================
    // 2. CONSTRUCTOR (KONSTRUKTOR)
    // =================================================================================
    // Konstruktor adalah method khusus yang namanya sama dengan nama kelas.
    // Ia dipanggil secara otomatis saat sebuah object dibuat (contoh: new Hewan(...)).
    // Fungsinya untuk memberikan nilai awal pada atribut objek.
    public Hewan(String nama, int umur) {
        // 'this.nama' merujuk pada atribut 'nama' milik kelas ini.
        // 'nama' (tanpa 'this') merujuk pada parameter yang masuk.
        this.nama = nama;
        this.umur = umur;
    }

    // B. ENKAPSULASI: Menyediakan method public (getter) untuk mengakses atribut private.
    // Ini adalah cara yang aman untuk "membaca" data yang disembunyikan.
    
    // =================================================================================
    // 3. METHOD DENGAN RETURN
    // =================================================================================
    // Method ini mengembalikan nilai (return) dengan tipe data String.
    public String getNama() {
        return nama; // Keyword 'return' mengirimkan nilai 'nama' kembali ke pemanggil.
    }

    // Method ini mengembalikan nilai dengan tipe data integer.
    public int getUmur() {
        return umur;
    }

    // =================================================================================
    // 4. METHOD VOID DENGAN PARAMETER
    // =================================================================================
    // 'void' berarti method ini tidak mengembalikan nilai apa pun.
    // '(String makanan)' adalah PARAMETER, yaitu input yang dibutuhkan oleh method ini.
    public void makan(String makanan) {
        System.out.println(nama + " makan " + makanan);
    }

    // =================================================================================
    // 5. POLYMORPHISM (POLIMORFISME) - Method Dasar
    // =================================================================================
    // Method ini akan didefinisikan ulang (di-override) oleh kelas anak (subclass).
    // Ini adalah dasar dari polimorfisme: nama method sama, tapi implementasinya beda-beda.
    public void bersuara() {
        System.out.println("Hewan bersuara umum");
    }

    // Contoh lain method dengan 'return'
    public String deskripsi() {
        return "Nama: " + nama + ", Umur: " + umur + " tahun";
    }
}

// =================================================================================
// 6. INHERITANCE (PEWARISAN)
// =================================================================================
// 'class Kucing extends Hewan' berarti Kucing adalah kelas turunan (subclass/child class) dari Hewan.
// Kucing akan MEWARISI semua atribut dan method public dari Hewan.
class Kucing extends Hewan {
    // Konstruktor untuk kelas Kucing.
    public Kucing(String nama, int umur) {
        // 'super(nama, umur)' WAJIB dipanggil untuk meneruskan nilai ke konstruktor kelas induk (Hewan).
        super(nama, umur);
    }

    // B. POLYMORPHISM: Method Overriding.
    // Anotasi '@Override' menandakan bahwa method ini menimpa/mengganti implementasi
    // method 'bersuara()' yang ada di kelas induk (Hewan).
    @Override
    public void bersuara() {
        // getNama() adalah method warisan dari kelas Hewan.
        System.out.println(getNama() + " mengeong");
    }

    // Method spesifik yang hanya dimiliki oleh kelas Kucing.
    public String jenis() {
        return "Kucing peliharaan";
    }
}

// Kelas turunan lain, untuk menunjukkan polimorfisme lebih jelas.
class Anjing extends Hewan {
    public Anjing(String nama, int umur) {
        super(nama, umur);
    }

    // Implementasi 'bersuara()' yang berbeda dari Kucing.
    @Override
    public void bersuara() {
        System.out.println(getNama() + " menggonggong");
    }
    
    public String jenis() {
        return "Anjing penjaga";
    }
}

// Kelas utama untuk menjalankan program.
public class Main {
    // Method 'main' adalah pintu masuk utama program Java.
    public static void main(String[] args) {
        // =================================================================================
        // 7. OBJECT (OBJEK)
        // =================================================================================
        // Membuat object (instance) dari class Kucing dan Anjing.
        // 'kucing' dan 'anjing' adalah objek.
        Kucing kucing = new Kucing("Miko", 2);
        Anjing anjing = new Anjing("Rex", 3);

        // Memanggil method 'makan' yang diwarisi dari kelas Hewan.
        kucing.makan("ikan");
        anjing.makan("tulang");
        System.out.println("---"); // Pemisah agar rapi

        // Memanggil method yang mengembalikan nilai (return) lalu menampilkannya.
        System.out.println("Deskripsi kucing: " + kucing.deskripsi());
        System.out.println("Deskripsi anjing: " + anjing.deskripsi());
        System.out.println("---");

        // Memanggil method return yang spesifik ada di subclass.
        System.out.println("Jenis kucing: " + kucing.jenis());
        System.out.println("Jenis anjing: " + anjing.jenis());
        System.out.println("---");

        // C. POLYMORPHISM dalam aksi:
        // Memanggil method 'bersuara()' pada objek yang berbeda.
        // Meskipun nama methodnya sama, outputnya berbeda sesuai dengan object-nya.
        kucing.bersuara(); // Akan menjalankan bersuara() milik Kucing.
        anjing.bersuara(); // Akan menjalankan bersuara() milik Anjing.
        System.out.println("---");

        // =================================================================================
        // 8. OPERATOR dan IF-ELSE (Kondisional)
        // =================================================================================
        // Menggunakan OPERATOR '+' untuk penjumlahan.
        int totalUmur = kucing.getUmur() + anjing.getUmur(); // 2 + 3 = 5
        // Menggunakan OPERATOR '>' (lebih besar dari) dalam kondisi IF.
        if (totalUmur > 4) {
            // Blok ini akan dieksekusi jika kondisi 'true'.
            System.out.println("Umur total lebih dari 4 tahun (Total: " + totalUmur + ")");
        } else {
            // Blok ini akan dieksekusi jika kondisi 'false'.
            System.out.println("Umur total kurang dari atau sama dengan 4 tahun");
        }
        System.out.println("---");

        // =================================================================================
        // 9. FOR LOOP (Perulangan)
        // =================================================================================
        // Melakukan perulangan kode di dalam blok for sebanyak 3 kali.
        // i = 1 (awal), i <= 3 (kondisi berhenti), i++ (penambahan setiap iterasi).
        for (int i = 1; i <= 3; i++) {
            System.out.println("Perulangan ke-" + i);
        }
        System.out.println("---");

        // Contoh memanggil method static 'tambahUmur' yang ada di kelas ini.
        int hasil = tambahUmur(kucing.getUmur(), anjing.getUmur());
        System.out.println("Hasil penjumlahan umur (dari method return): " + hasil);
    }

    // Method static: method yang bisa dipanggil langsung dari kelasnya tanpa perlu membuat objek.
    // Method ini juga contoh penggunaan 'return' untuk mengembalikan hasil operasi.
    public static int tambahUmur(int a, int b) {
        return a + b; // Operator '+' digunakan lagi.
    }
}