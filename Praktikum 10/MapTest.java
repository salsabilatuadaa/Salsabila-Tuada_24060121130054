/**
 *  Nama : Salsabila Tuada
 *  NIM : 24060121130054
 *  File : MapTest.java
 *  Deskripsi : Implementasi lambda pada List, digunakan sebagai parameter peda method
 */

import java.util.*;
public class MapTest {
	public static void main(String[] args){
		Map<String, String> mahasiswa = new HashMap<>();
		mahasiswa.put("24060121130054", "Salsabila Tuada");
		mahasiswa.forEach((nim, nama) -> System.out.println("NIM: "+nim+ "/n Nama Mahasiswa: " +nama));
	}
}