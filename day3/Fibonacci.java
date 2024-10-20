package week1.day3;

public class Fibonacci {

	public static void main(String[] args) {
		int a=0;
		int b=1;
		for (int i =0; i<8; i++) {
			
			int sum =a+b ;
			a=b;
			b=sum;
			System.out.println(a+"");
			
			
		}
	}
}
//0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144
//0,1,2,3,4,5,6,7,8