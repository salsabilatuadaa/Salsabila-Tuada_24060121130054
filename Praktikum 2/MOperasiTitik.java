/**
 * File      : MOperasiTitik.java		01/03/23
 * Penulis   : Salsabila Tuada
 * Deskripsi : Kelas yang berisi main dari OperasiTitik
 * 
 */

class MOperasiTitik{
   public static void main(String[]args)
   {
	Titik t1 = new Titik(1.0, 2.0);
	OperasiTitik op = new OperasiTitik();

	System.out.println("t1("+t1.getAbsis()+", "+t1.getOrdinat() +")");

	op.refleksiSumbuX(t1);
	System.out.println("\nRefleksi terhadap sumbu X");
	System.out.println("t1("+t1.getAbsis()+", "+t1.getOrdinat()+")");
		
	op.refleksiSumbuY(t1);
	System.out.println("\nRefleksi terhadap sumbu Y");
	System.out.println("t1("+ t1.getAbsis()+", "+t1.getOrdinat()+")");
   }
}