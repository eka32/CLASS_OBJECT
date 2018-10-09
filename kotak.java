
public class kotak {
	
	private double Panjang, Lebar, Luas, Keliling;
	
	//ini metghod getter
	public double getPanjang()
	{
		return Panjang;
	}
	public double getLebar()
	{
		return Lebar;
	}
	
	public double getLuas()
	{
		return Luas;
	}	
	public double getkeliling()
	{
		return Keliling;
	}
	
	//ini method setter
	public void setpanjang(double panjang)
	{
		this.Panjang = Panjang; 
	}
	public void setLebar(double Lebar)
	{
		this.Lebar = Lebar;
	}
	public void setLuas(double luas)
	{
		this.Luas = Luas;
	}
	public void setKeliling(double Keliling)
	{
		this.Keliling = Keliling;
	}
	//method
	void hitungLuas() {
	Luas = Panjang * Lebar;
	}
	
	void hitungKeliling() {
	Keliling= 2*Panjang + 2*Lebar;
	
	}
}
