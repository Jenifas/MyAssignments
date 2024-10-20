package week1.day3;

import java.util.Arrays;

public class printDuplicatevalues {
	public static void main(String[] args) {
		int num []= {8,5,5,7,9,9};
		//length of arr
		int arrlength = num.length;
		System.out.println(arrlength);
		//sort arr default asc
		Arrays.sort(num);
		System.out.println("after sorting:"+num[0] );
		//duplicate print
		for (int i = 0; i<arrlength- 1; i++) {
		if (num[i] == num[i+1]);
			{
				System.out.println("print duplicate:" +num[i] );
			}
				
			
		}
		
	}
}


