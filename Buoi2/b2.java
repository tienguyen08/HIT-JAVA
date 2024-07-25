package btvn;
import java.util.Scanner;
import java.lang.Math;
public class b2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		int a[] = new int [n];
		for(int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		
		for(int i = 0; i < n; i++) {
			if(i % 2 != 0) {
				if(i == n-1){
					if((n-1)%2 != 0) {
						a[n-1] += a[n-2];
					}
				}
				else {
					int temp = a[i-1] - a[i+1];
				 a[i]+=Math.abs(temp);
				}
			}
		}
		for(int i = 0; i < n; i++) {
			System.out.println(a[i] + " ");
		}
	}
}
