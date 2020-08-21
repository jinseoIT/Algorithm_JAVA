package Level01;

import java.util.Scanner;

public class Start_num20 {

	public static void main(String[] args) {
		// º° Âï±â -1
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
	}

}
