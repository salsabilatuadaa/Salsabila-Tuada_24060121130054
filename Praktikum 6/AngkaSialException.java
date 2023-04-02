/**
 * File      : AngkaSialException.java		02/04/23
 * Penulis   : Salsabila Tuada
 * Deskripsi : Eksepsi buatan sendiri, menolak masukan angka 13!
 * 
 */

public class AngkaSialException extends Exception{
	public AngkaSialException(){
		super("jangan memasukkan angka 13 karena angka sial !!!");	
	}
}