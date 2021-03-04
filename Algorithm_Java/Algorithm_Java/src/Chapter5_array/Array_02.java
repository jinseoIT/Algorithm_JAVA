package Chapter5_array;

import java.util.Scanner;

public class Array_02 {

	public static void main(String[] args) {
 
	int cnt = 9; int maxNum = 0; int maxIndex = 0;
	Scanner sc = new Scanner(System.in);
	int[] nums = new int[cnt];
	for(int i=0;i<cnt;i++) {
		nums[i] = sc.nextInt();
	}
	for(int i=0;i<nums.length;i++) {
		if(nums[i]>maxNum) {
			maxNum = nums[i];
			maxIndex =i+1;
		}
	}
	System.out.println(maxNum); System.out.println(maxIndex);
	
	
	}

}
