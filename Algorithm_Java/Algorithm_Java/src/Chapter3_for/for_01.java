package Chapter3_for;

import java.util.Scanner;

public class for_01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		for(int i=1;i<10;i++) {
			System.out.println(num+" * "+i+" = "+num*i);
		}
	}
}
