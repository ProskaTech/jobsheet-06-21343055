/*
 * Nama : Muhamad Fathur Rahman
 * NIM  : 21343055
 * Prodi: Teknik Informatika
 */
package Tugas;

import javax.swing.JOptionPane;

public class Tugas1b {
public static void main(String [] args) {
    String a = JOptionPane.showInputDialog("Masukkan nilai pertama anda :");
    String b = JOptionPane.showInputDialog("Masukkan nilai kedua anda :");
    String c = JOptionPane.showInputDialog("Masukkan nilai ketiga anda :");

    int num1 = Integer.parseInt(a); 
    int num2 = Integer.parseInt(b); 
    int num3 = Integer.parseInt(c);
    
    int rumus=(num1 + num2 + num3) / 3; 
        
if 
    (rumus <= 60) {
        String msg1 = ":-(";
        JOptionPane.showMessageDialog(null, msg1);
 }
 else {
    String msg2 = ":-)";
    JOptionPane.showMessageDialog(null, msg2);
}
}    
}
