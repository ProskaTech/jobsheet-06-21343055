/*
 * Nama : Muhamad Fathur Rahman
 * NIM  : 21343055
 * Prodi: Teknik Informatika
 */
package Tugas;

import java.io.BufferedReader; 
import java.io.InputStreamReader; 
import java.io.IOException;

public class Tugas1a {
    public static void main(String []args) {
    BufferedReader nilai = new BufferedReader (new InputStreamReader (System.in));
      String a = ""; 
      String b = ""; 
      String c = "";

try {
       System.out.print("Masukan nilai pertama Anda :"); 
       a = nilai.readLine(); 
       System.out.print("Masukan nilai kedua Anda :"); 
       b = nilai.readLine(); 
       System.out.print("Masukan nilai ketiga Anda :");
       c = nilai.readLine(); 
}

catch (IOException e) {
       System.out.println("Kata yang anda masukan salah, silahkan coba lagi.");
}

       int num1; 
       int num2; 
       int num3;

       num1 = Integer.parseInt(a); 
       num2 = Integer.parseInt(b); 
       num3 = Integer.parseInt(c);
       int  rumus=(num1 + num2 + num3) / 3; 
            System.out.println("Rata-rata nilai: " + rumus); 
       if 
           (rumus<=60) {System.out.println(":-(");
        }
        else {
            System.out.print(":-)");
        }
    }
}

