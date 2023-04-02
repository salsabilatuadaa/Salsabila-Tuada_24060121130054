/**
 * File      : MLingkaran.java		02/04/23
 * Penulis   : Salsabila Tuada
 * Deskripsi : implementasi cara menghitung luas lingkaran
 * 
 */

import java.util.Scanner;

public class MLingkaran{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukkan jejari Lingkaran : ");
		double r = scan.nextDouble();
		Lingkaran l = new Lingkaran(r);
		scan.close();
		System.out.println("Luas lingkaran dengan jejari "+l.jejari+
			" satuan adalah "+l.hitungLuas());
	}
}