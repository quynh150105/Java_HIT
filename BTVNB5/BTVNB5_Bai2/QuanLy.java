package BTVNB5;
import java.util.Scanner;
public class QuanLy {
	private String MaQL;
	private String HoTen;
	
	public QuanLy(String MaQL, String HoTen) {
		this.MaQL = MaQL;
		this.HoTen = HoTen;
	}
	public QuanLy() {
		
	}
	
	public void setMaQL(String MaQL) {
		this.MaQL = MaQL;
	}
	public String getMaQL() {
		return MaQL;
	}
	
	public void setHoTen(String HoTen) {
		this.HoTen = HoTen;
	}
	public String getHoTen() {
		return HoTen;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap MaQL: ");
		this.MaQL = sc.nextLine();
		System.out.println("Nhap HoTen: ");
		this.HoTen = sc.nextLine();
	}
	
	public void Output() {
		System.out.printf("%15s %15s %n", MaQL, HoTen);
	}

}
