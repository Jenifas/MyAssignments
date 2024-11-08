package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver facedriver= new ChromeDriver();
		facedriver.get("https://www.facebook.com/");
		facedriver.manage().window().maximize();
		String title = facedriver.getTitle();
		System.out.println(title);
		facedriver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");
		facedriver.findElement(By.id("pass")).sendKeys("Tuna@321");
		facedriver.findElement(By.name("login")).click();
		facedriver.findElement(By.linkText("Find your account and log in.")).click();
		if (title.contains("facebook")) {System.out.println("Verified");
			
		} else {
			System.out.println("not verified");

		}
	}
}
		

	
	
		
		//facedriver.close(
