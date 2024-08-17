package BTVNB5;
import java.util.Scanner;

public class May {
	private String MaMay;
	private String TenMay;
	private String TinhTrang;
	
	public May() {	
	}
	
	public May(String MaMay, String TenMay, String TinhTrang) {
		this.MaMay = MaMay;
		this.TenMay = TenMay;
		this.TinhTrang = TinhTrang;
	}
	public void setMaMay(String MaMay) {
		this.MaMay= MaMay;
	}
	public String getMaMay() {
		return MaMay;
	}
	
	public void setTenMay(String TenMay) {
		this.TenMay = TenMay;
	}
	public String getTenMay() {
		return TenMay;
	}
	public void setTinhTrang(String TinhTrang) {
		this.TinhTrang = TinhTrang;
	}
	public String getTinhTrang() {
		return TinhTrang;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ma may nhap: ");
		this.MaMay = sc.nextLine();
		System.out.println("Ten may nhap: ");
		this.TenMay = sc.nextLine();
		System.out.println("Tinh trang: ");
		this.TinhTrang = sc.nextLine();
	}
	
	public void Xuat() {
		System.out.printf("%15s %15s %15s %n", "MaMay", "TenMay", "TinhTrang");
		System.out.printf("%15s %15s %15s %n", MaMay, TenMay, TinhTrang);
	}
	

}
