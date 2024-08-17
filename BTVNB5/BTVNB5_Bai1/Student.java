package BTVNB5_Bai1;
import java.util.Scanner;

public class Student {
	private String Name;
	private String Class;
	private Double Score;
	private Faculty y = new Faculty();
	
	public Student( String Name, String Class, Double Score, Faculty y) {
		this.Name = Name;
		this.Class = Class;
		this.Score = Score;
		this.y = y;
	}
	
	public Student() {
	}

	public void setName(String Name) {
		this.Name = Name;
	}
	public String getName() {
		return Name;
	}
	
	public String getClassName() {
		return Class;
	}
	public void setClassName(String Class) {
		this.Class = Class;
	}
	
	
	public void setScore(Double Score) {
		this.Score = Score;
	}
	public Double getScore() {
		return Score;
	}
	
	public void sety(Faculty y) {
		this.y = y;
	}
	public Faculty gety() {
		return y;
	}
	
	public void Input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ten Student: ");
		Name = sc.nextLine();
		System.out.println("Lop: ");
		Class = sc.nextLine();
		System.out.println("Diem: ");
		Score = sc.nextDouble();
		y.Input();
	}
	
	 public void Output () {
	    System.out.printf("%15s %15s %15.2f", Name, Class, Score);
	    y.Output();
	  }
}
