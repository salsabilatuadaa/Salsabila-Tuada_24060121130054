/**
 *  Nama : Salsabila Tuada
 *  NIM : 24060121130054
 *  File : DAOManager.java
 *  Deskripsi : Pengelola DAO dalam program
 */

public class DAOManager{
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}
	
	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}