public class Programmer extends Pegawai{
	private int bonus = 450000;
	public Programmer (String nama){
		super.setNama(nama);
	}
	public void tampilData(){
		super.tampilData();
		System.out.println("Bonus: "+this.bonus);
	}
}