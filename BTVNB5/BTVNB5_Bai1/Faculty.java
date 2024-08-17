package BTVNB5_Bai1;
import java.util.Scanner;

public class Faculty {
	private String FName;
	private String FDate;
	private School x = new School() ;
	
	public Faculty(String FName, String FDate, School x) {
		this.FName = FName;
		this.FDate = FDate;
		this.x = x;
	}
	
	public Faculty() {
	}

	public void setFName(String FName) {
		this.FName = FName;
	}
	public String getFName() {
		return FName;
	}
	
	public void setFDate(String FDate) {
		this.FDate = FDate;
	}
	public String getFDate() {
		return FDate;
	}
	
	public void setx(School x) {
		this.x = x;
	}
	public School getx() {
		return x;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ten Khoa: ");
		this.FName = sc.nextLine();
		System.out.println("Ngay vao: ");
		this.FDate = sc.nextLine();
		System.out.println("Ten Truong: ");
		x.setName(sc.nextLine());
		System.out.println("Ngay vao Truong: ");
		x.setDate(sc.nextLine());
	}
	
	public void Output () {
        System.out.printf("%15s %15s %15s %15s %n", x.getName(), x.getDate(), FName, FDate);
    }
	
	
}
