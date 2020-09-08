package Chapter3_for;

import java.util.Scanner;

public class for_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		for(int i=1;i<=input;i++) {
			for(int j=1;j<=input;j++) {
				System.out.print("");
				if(j>=i) {
					System.out.println("*");
				}
			}
			System.out.println();
		}
	}

}
