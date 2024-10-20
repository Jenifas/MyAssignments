package week1.day4;

import java.util.Scanner;

public class Palindrom {

	public int Reversenumber(int num)
	{
		{ //reverse number logic
	        int reversed = 0;
	        int remainder;
	        while (num > 0) {
	        	remainder=num%10;
	            reversed = reversed * 10 + remainder; //num=123 -->r1=3 r2=30+2=32 r3=320+1 =321
	            num = num / 10;//123/10=12,12/10=1,1/10=0
	        }
	        return reversed;
	    }
		
	}
	public static void main(String[] args) {
		//int num = 123456;
		Scanner in = new Scanner(System.in);  
        System.out.print("Enter your number: ");  
        int num = in.nextInt();  
	Palindrom objReverse = new Palindrom();
	int reversenumber = objReverse.Reversenumber(num);
	System.out.println(+reversenumber);
	if (num == reversenumber)
        System.out.println("Palindrome = Yes");
    else
        System.out.println("Palindrome = No");
	




	}

}
