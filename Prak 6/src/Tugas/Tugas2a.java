/*
 * Nama : Muhamad Fathur Rahman
 * NIM  : 21343055
 * Prodi: Teknik Informatika
 */
package Tugas;

import java.util.Scanner;

public class Tugas2a {
    public static void main(String []args) {
        Scanner inputNilai = new Scanner(System.in);

        int angka;

        System.out.print("Masukkan Angka: ");
        angka = inputNilai.nextInt();

        if (angka == 1) {
            System.out.println("Satu");
        }
        else if (angka == 2) {
            System.out.println("Dua");
        }
        else if (angka == 3) {
            System.out.println("Tiga");
        }
        else if (angka == 4) {
            System.out.println("Empat");
        }
        else if (angka == 5) {
            System.out.println("Lima");
        }
        else if (angka == 6) {
            System.out.println("Enam");
        }
        else if (angka == 7) {
            System.out.println("Tujuh");
        }
        else if (angka == 8) {
            System.out.println("Delapan");
        }
        else if (angka == 9) {
            System.out.println("Sembilan");
        }
        else if (angka == 10) {
            System.out.println("Sepuluh");
        } else {
            System.out.println("Invalid Number");
        }
        
    }
}
