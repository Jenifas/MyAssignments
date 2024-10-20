package week1.day4;

public class Reversecharat {

	public static void main(String[] args) {
		String str ="Jenifa";
		
		//to change string to array
		char[] charArray = str.toCharArray();
		System.out.println(charArray);
		
		//
		for(int i=0; i<charArray.length; i++)
		{
		System.out.println(charArray[i]);
		}
		//reversed order
		for(int i=charArray.length-1; i>=0; i--)
		{
		System.out.print(charArray[i]);
		}
	}

}
