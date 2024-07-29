package BTVNB2;
import java.util.Scanner;
import java.math.*;

public class Bai1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double pi = 3.14;
		System.out.print("r= ");
		double r = sc.nextDouble();
		double ChuVi = 2*pi*r;
		double DienTich = pi*Math.pow(r,2);
		System.out.println("chu vi la: " + ChuVi);
		System.out.println("dien tich la: " + DienTich);
	}
}
