package Level01;

import java.util.Scanner;

public class AB7_num21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cnt = sc.nextInt();
		int nums[] = new int[cnt];
		int inputNum1;
		int inputNum2;
		
		for(int i=0;i<cnt;i++) {
			inputNum1 = sc.nextInt();
			inputNum2 = sc.nextInt();
			
			nums[i] = inputNum1 + inputNum2;
		}
		
		for(int i=0;i<cnt;i++) {
			int sun = i+1;
			System.out.println("Case #"+sun+": "+nums[i]);
		}
	
	}

}
