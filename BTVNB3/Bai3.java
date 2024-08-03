package BTVNB3;
import java.util.Scanner;
import java.util.Random;

public class Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		int a = rd.nextInt(11);
		int b = rd.nextInt(11);
		int c;
		boolean Correct = rd.nextBoolean();
		if(Correct) {
			c = a + b;
		}
		else {
			do {
				c = rd.nextInt(21);
			}while(c == a + b);
		}
		System.out.println(a +" + " + b +" = " + c);
		System.out.print("phep toan tren dung hay sai (Y/N): ");
		String s = sc.nextLine();
		if((a+b==c && s.equals("Y") || (a+b!=c && s.equals("N"))))
			System.out.println("chinh xac!");
		else if((a+b==c && s.equals("N") || (a+b!=c && s.equals("Y"))))
			System.out.println("sai!");
			
	}
}
