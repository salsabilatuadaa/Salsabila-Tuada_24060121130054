/**
 * File      : Asersi2.java		02/04/23
 * Penulis   : Salsabila Tuada
 * Deskripsi : Program untuk demo asersi, yang akan menolak input jari-jari 
 *		lingkaran yang bernilai nol
 * 
 */

class Lingkaran {
	private double jariJari;
	public Lingkaran(double jariJari){
		this.jariJari = jariJari;
	}
	public double hitungKeliling(){
		double keliling = 2*Math.PI*jariJari;
		return keliling;
	}
}

public class Asersi2{
	public static void main(String[] args){
		double jariJari = 0;
		assert(jariJari > 0) : "jari jari tidak boleh nol!!!";
		Lingkaran l = new Lingkaran(jariJari);
		double kelilingLingkaran = l.hitungKeliling();
		System.out.println("keliling lingkaran = "+kelilingLingkaran);
	}
}



/* Pertanyaan
 * Secara konsep, ada yang kurang tepat pada program Asersi2 di atas?
 */

/* Jawab:
 * Ada, program Asersi2 adalah program yang menolak input jari jari lingkaran 
   yang bernilai nol, yang artinya hanya bilangan nol saja yg tidak dijalankan. 
   Sedangkan pada kode diatas, bilangan negatif juga tidak bisa dijalankan karena 
   asersi didefinisikan dengan assert(jariJari > 0). Maka dari itu, seharusnya 
   asersi didefinisikan dengan assert(jariJari != 0) sehingga nantinya hanya angka
   0 saja yang tidak bisa dijalankan, bilangan negatif dan positif bisa dijalankan.
 */