public class Main {
    public static void main(String[] args) {
        Programmer pr = new Programmer();
        Software sf = new Software();

        pr.startCoding();
        System.out.println("Nilai : " + sf.nilaiHuruf(90));
    }
}