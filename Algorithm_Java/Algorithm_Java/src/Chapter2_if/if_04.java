package Chapter2_if;

import java.util.Scanner;

public class if_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int xNum = sc.nextInt();
		int yNum = sc.nextInt();
		int result = 0;
		
		if(xNum >0 && yNum >0) {
			result = 1;
		}else if(xNum <0 && yNum >0) {
			result = 2;
		}else if(xNum <0 && yNum <0) {
			result = 3;
		}else {
			result = 4;
		}
		
		System.out.println(result);
		
	}

}
