package Chapter2_if;

import java.util.Scanner;

public class if_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int M = sc.nextInt();
		M -= 45;
		if(M<0) {
			M += 60;
			H --;
			if(H<0) {
				H += 24;
			}
		}
		System.out.println(H+" "+M);
		
		
	}

}
