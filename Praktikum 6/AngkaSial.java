/**
 * File      : AngkaSial.java		02/04/23
 * Penulis   : Salsabila Tuada
 * Deskripsi : Program penggunaan exception buatan sendiri
 *		Pengenalan klausa 'throw' dan 'throws'
 * 
 */

public class AngkaSial{
	
	public void cobaAngka(int angka) throws AngkaSialException{
		if(angka == 13){
			throw new AngkaSialException();
		}
		System.out.println(angka+ " bukan angka sial");
	}

	public static void main(String[] args){
		AngkaSial as = new AngkaSial();
		try{
			as.cobaAngka(10);
			as.cobaAngka(13);
			as.cobaAngka(12);
		}catch(AngkaSialException ase){
			System.out.println(ase.getMessage());
			System.out.println("hati-hati memasukkan angka!!!");
		}
	}
}

/* Pertanyaan
 * Ketika eksepsi terjadi, apakah baris 12 pada AngkaSial.java diatas dieksekusi?
 * Apakah baris 21 pada AngkaSial.java di atas dieskekusi?
 */

/* Jawab:
 * Baris 12 yaitu "System.out.println(angka+ " bukan angka sial");" pada AngkaSial.java 
   tidak akan dieksekusi ketika terjadi eksepsi. Hal tersebut dikarenakan ketika 
   terjadi eksepsi, dimana angka yang di input adalah 13, maka program akan memanggil
   AngkaSialException() dan mengeluarkan ouput pada program AngkaSialException()
   yang selanjutnya program akan masuk ke baris "catch(AngkaSialException ase)"
   dan mengeluarkan ouput pada catch
 * Baris ke 21 yaitu "catch(AngkaSialException ase)" pada program AngkaSial.java 
   dieksekusi. Baris 21 dieksekusi ketika menjalankan input "as.cobaAngka(13)"
   dimana input 13 merupakan eksepsi. Sehingga program akan langsung masuk ke blok
   catch yang merupakan blok untuk menangani ketika terjadi eksepsi. Pada kasus ini,
   program catch akan mencetak pesan yang diperoleh dari pemanggilan metode getMessage()
   pada objek AngkaSialExcpetion dan pesan "hati-hati memasukkan angka!!!" 
 */