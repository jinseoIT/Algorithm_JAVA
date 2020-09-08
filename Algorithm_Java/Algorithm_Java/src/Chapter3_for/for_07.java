package Chapter3_for;

import java.util.ArrayList;
import java.util.Scanner;

public class for_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList numbers = new ArrayList();
		Scanner sc = new Scanner(System.in);
		int cnt,num1,num2;
		
		cnt = sc.nextInt();
		for(int i=0;i<cnt;i++) {
			num1 = sc.nextInt();
			num2 = sc.nextInt();
			numbers.add(num1+num2);
		}

		for(int i=0;i<numbers.size();i++) {
			System.out.println("Case #"+(i+1)+": "+numbers.get(i));
		}
		
		/* ÁÁÀº ´ä
		 * int a = s.nextInt(); for(int i=1; i<=a; i++) {
		 * System.out.println("Case #"+i+": "+(s.nextInt()+s.nextInt()));} 
		 */
		
		
		
	}

}
