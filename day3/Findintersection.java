package week1.day3;

public class Findintersection {

	public static void main(String[] args) {
		int a[]={3,2,11,4,6,7};
		int b[]={1,2,8,4,9,7};
		
		
		int blength = b.length;
		int alength = a.length;
		
		for (int i = 0; i < alength; i++)
		for (int j = 0; j < blength; j++)
		{
		if (a[i]==b[i]) {
			System.out.println(a[i]);
			break;
			} 
				
		}

	}

}
