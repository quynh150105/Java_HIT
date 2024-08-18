package Kiemtra;
import java.util.Scanner;

public class Bai1 {
	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		do {
			t = sc.nextInt();
		}
		while(t < 1 || t > 100);
		
		String[] chuoi = new String[t];
		for(int i = 0; i<t; ++t) {
			chuoi[i] = sc.nextLine();
		}
		
		System.out.println(t);
		for(int i = 0; i< t; ++t) {
			for(int j = 0; j < chuoi[i].length(); ++j) {
				 {
					
				}
				
			}
		}
		
	}
}
