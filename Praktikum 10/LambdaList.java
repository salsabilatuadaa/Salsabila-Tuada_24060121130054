/**
 *  Nama : Salsabila Tuada
 *  NIM : 24060121130054
 *  File : LambdaList.java
 *  Deskripsi : Implementasi lambda pada List, digunakan sebagai parameter peda method
 */

import java.util.ArrayList;
public class LambdaList{
	public static void main(String[] args) {
		ArrayList<String> mahasiswaList = new ArrayList<>();
		mahasiswaList.add("Adi");
		mahasiswaList.add("Bambang");
		mahasiswaList.add("Cici");
		mahasiswaList.add("Didi");
		
		//lambda digunakan sebagai parameter
		mahasiswaList.forEach((nama) -> System.out.println(nama));
	}
}