package week1.day4;

import java.util.Arrays;

public class MissingArrvalue {  
    public static void findMissingNumbers(int[] arr, int max) {  
        for (int i = 1; i <= max; i++) {  
            boolean found = false; 
            //loop through the array
            for (int num : arr) {  
            
                if (num == i) {  
                    found = true;  
                    break;  
                }  
            }  
            if (!found) {  
                System.out.print(i + " ");  
            }  
        }  
    
    }  
    public static void main(String[] args) {  
        int[] arr = {1,4,3,2,6,7};  
        int max = 8;  
        System.out.println("Missing numbers in the array:");  
        findMissingNumbers(arr, max);  
    }  
}  

	
		
		
		

	


