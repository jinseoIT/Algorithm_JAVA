package Chapter3_for;

import java.util.Scanner;

public class for_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cntT = sc.nextInt();
		int firstNum = 0;
		int secondNum = 0;
		int result[] = new int[cntT];
		
		for(int i=0;i<cntT;i++) {
			firstNum = sc.nextInt();
			secondNum = sc.nextInt();
			result[i]=firstNum+secondNum;
		}
		
		for(int i=0;i<cntT;i++) {
			System.out.println(result[i]);
		}
		
	}

}
