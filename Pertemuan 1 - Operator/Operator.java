import java.util.Scanner;

public class Operator {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        char ulang;

        System.out.println();
        System.out.println("===== JENIS-JENIS OPERATOR  ======");
        System.out.println();

        do{
            operatorAritmatika();
            operatorAssignment();
            operatorPerbandingan();
            operatorLogika();
            
            System.out.print("Ulangi program (y/n)? : ");
            ulang = input.next().charAt(0);
            System.out.println();
        } while(ulang == 'y' || ulang == 'Y');
        {
            System.out.println("PROGRAM SELESAI!!");
        }
    }

    public static void operatorAritmatika() {
        System.out.println("=== Operator Aritmatika ===");
        
        System.out.print("Masukkan nilai x untuk aritmatika: ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai y untuk aritmatika: ");
        int y = input.nextInt();
        
        System.out.println("Diketahui x = " + x + " dan y = " + y);
        System.out.println("x + y = " + (x + y));
        System.out.println("x - y = " + (x - y));
        System.out.println("x * y = " + (x * y));
        System.out.println("x / y = " + (x / y));
        System.out.println("x % y = " + (x % y));
        System.out.println("++x   = " + (++x));
        System.out.println("--y   = " + (--y));
        System.out.println();
    }

    public static void operatorAssignment() {
        System.out.println("=== Operator Assignment ===");

        System.out.print("Masukkan nilai x untuk assignment: ");
        int x = input.nextInt();
        
        System.out.println("Nilai awal x adalah " + x);
        x += 3;
        System.out.println("x += 3  nilai x sekarang = " + x);
        x -= 2;
        System.out.println("x -= 2  nilai x sekarang = " + x);
        x *= 4;
        System.out.println("x *= 4  nilai x sekarang = " + x);
        x /= 3;
        System.out.println("x /= 3  nilai x sekarang = " + x);
        x %= 5;
        System.out.println("x %= 5  nilai x sekarang = " + x);
        System.out.println();
    }

    public static void operatorPerbandingan() {
        System.out.println("=== Operator Perbandingan ===");
        
        System.out.print("Masukkan nilai x untuk perbandingan: ");
        int x = input.nextInt();
        System.out.print("Masukkan nilai y untuk perbandingan: ");
        int y = input.nextInt();
        
        System.out.println("Diketahui x = " + x + " dan y = " + y);
        System.out.println("x == y --> " + (x == y));
        System.out.println("x != y --> " + (x != y));
        System.out.println("x > y  --> " + (x > y));
        System.out.println("x < y  --> " + (x < y));
        System.out.println("x >= y --> " + (x >= y));
        System.out.println("x <= y --> " + (x <= y));
        System.out.println();
    }

    public static void operatorLogika() {        
        System.out.println("=== Operator Logika ===");
        
        System.out.print("Masukkan nilai x untuk logika: ");
        int x = input.nextInt();
        
        System.out.println("Diketahui x = " + x);
        System.out.println("(x < 10 && x > 2)  --> " + (x < 10 && x > 2));
        System.out.println("(x > 10 && x > 2)  --> " + (x > 10 && x > 2));
        System.out.println("(x > 8 || x < 4)   --> " + (x > 8 || x < 4));
        System.out.println("(x < 8 || x < 4)   --> " + (x < 8 || x < 4));
        System.out.println("!(x < 5 && x < 10) --> " + !(x < 5 && x < 10));
        System.out.println("!(x > 5 && x > 10) --> " + !(x > 5 && x > 10));
        System.out.println();
    }
}