/**
  * Nama : Salsabila Tuada
  * NIM : 24060121130054
  * File : BangunDatarGeneric.java
  * Deskripsi : kelas konstruksi generic untuk bangun datar
  */

public class BangunDatarGeneric<T2 extends BangunDatar>{
	private T2 bangunDatar;

	public void set(T2 tipeBangunDatar){
		bangunDatar = tipeBangunDatar;
	}

	public T2 get(){
		return bangunDatar;
	}
	
	public double hitungKeliling(){
		return bangunDatar.hitungKeliling();
	}
}

/** Ketika T diganti dengan variabel T2, program masih tetap berjalan dan
hasilnya tetap sama **/ 