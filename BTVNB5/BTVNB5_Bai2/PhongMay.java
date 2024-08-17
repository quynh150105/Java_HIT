package BTVNB5;
import java.util.Scanner;

public class PhongMay {
	private String MaPhong;
	private String TenPhong;
	private Double DienTich;
	private QuanLy x = new QuanLy();
	private May y = new May();
	private Integer n;
	
	public PhongMay() {
	}
	
	public void setMaPhong(String MaPhong) {
		this.MaPhong = MaPhong;
	}
	public String getMaPhong() {
		return MaPhong;
	}
	
	public void setTenPhong(String TenPhong) {
		this.TenPhong = TenPhong;
	}
	public String getTenPhong() {
		return TenPhong;
	}
	public void setDienTich(Double DienTich) {
		this.DienTich = DienTich;
	}
	public Double getDienTich() {
		return DienTich;
	}
	
	public void setx(QuanLy x) {
		this.x = x;
	}
	public QuanLy getx() {
		return x;
	}
	
	public void sety(May y) {
		this.y = y;
	}
	public May gety() {
		return y;
	}
	public void setn(Integer n) {
		this.n = n;
	}
	public Integer getn() {
		return n;
	}
	
	public void Nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap Ma Phong: ");
		this.MaPhong = sc.nextLine();
		System.out.println("Nhap Ten Phong ");
		this.TenPhong= sc.nextLine(); 
		System.out.println("Nhap So luong May: ");
		this.n = sc.nextInt();
		x.Input();
		y.Nhap();
	}
	
	public void Xuat() {
		System.out.printf("15%s, 15%s, 15%s, 15%s ", getMaPhong(), getTenPhong(), getDienTich(), getn() );
		x.Output();
		y.Xuat();
	}

}
