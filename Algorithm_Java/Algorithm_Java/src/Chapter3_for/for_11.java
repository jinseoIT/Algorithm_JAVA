package Chapter3_for;

import java.util.Scanner;

public class for_11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numCnt,numX,input;
		numCnt = sc.nextInt();
		numX = sc.nextInt();
		for(int i=0;i<numCnt;i++) {
			input = sc.nextInt();
			if(input<numX) {
				System.out.print(input+" ");
			}
		}
		
		
	}

}
