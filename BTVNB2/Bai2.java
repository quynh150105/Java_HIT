package BTVNB2;
import java.util.Scanner;
import java.math.*;

public class Bai2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("n= ");
		int n = sc.nextInt();
		int a[] = new int[n];
		for(int i = 0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		 for (int i = 1; i < n; i++){
             if(i%2 != 0 && i < n-1){
                 a[i] = a[i] + Math.abs(a[i-1]-a[i+1]);
             }
             if(i == n-1){
                 a[i] = a[i] +a[i-1];
             }
         }
		 for(int i = 0; i<n; i++) {
			 System.out.print(a[i]+ " ");
		 }
	}
}
