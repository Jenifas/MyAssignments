package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooklaunch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver facedriver= new ChromeDriver();
		facedriver.get("https://www.facebook.com/");
		facedriver.manage().window().maximize();
		String title = facedriver.getTitle();
		System.out.println(title);
		//facedriver.close();

	}

}
