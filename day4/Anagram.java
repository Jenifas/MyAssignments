package week1.day4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String i ="race";
String j ="care";

if (i.length()==j.length()) {
	//change char to array
char arr1[]=i.toCharArray();
char arr2[]=j.toCharArray();
//sort the array

Arrays.sort(arr1);
Arrays.sort(arr2);
//System.out.print(arr1);
//System.out.print(arr2);
//array.equals chks whether both the arrays are equal after sorting
boolean result = Arrays.equals(arr1, arr2);

if(result) {
    System.out.println(i + " and " + j + " are anagram.");
  }
  else {
    System.out.println(i + " and " + j + " are not anagram.");
  }

}
else {
    System.out.println(i + " and " + j + " are not anagram length mismatch.");
  }

}}
	
