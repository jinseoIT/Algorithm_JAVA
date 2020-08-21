package Level01;

import java.util.Scanner;

public class SugarMan {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int count=0;
		
		while(true) {
			if(input%5==0) {
				System.out.println(input/5+count);
				break;
			}else if(input<=0) {
				System.out.println(-1);
				break;
			}
			input -= 3;
			count ++;
		}
				
	}

}
