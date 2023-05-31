/**
 *  Nama : Salsabila Tuada
 *  NIM : 24060121130054
 *  File : MainDAO.java
 *  Deskripsi : Main program untuk akses DAO
 */

public class MainDAO{
	public static void main(String args[]){
		Person person = new Person("Indira");
		DAOManager m = new DAOManager();
		m.setPersonDAO(new MySQLPersonDAO());
		try{
			m.getPersonDAO().savePerson(person);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}