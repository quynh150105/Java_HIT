package BTVNB3;
import java.util.Scanner;


public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		System.out.println("S= "+ S);
		String value = new StringBuilder(S).reverse().toString();
        if (value.equals(S)) {
            String ANSWER = S.toUpperCase();
            System.out.println(ANSWER);
        }
        else {
            String answer = S.toLowerCase();
            System.out.println(answer);
        }
	}

}
