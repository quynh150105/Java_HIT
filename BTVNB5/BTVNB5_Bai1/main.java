package BTVNB5_Bai1;
import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("So Sinh vien: ");
		int n = sc.nextInt();
		Student[] sd = new Student[n];
		for(int i = 0; i< n; i++) {
			sd[i] = new Student();
			sd[i].Input();
		}
		for(int i = 0; i<n; i++) {
			sd[i].Output();
			System.out.println();
		}
	}
	
}
