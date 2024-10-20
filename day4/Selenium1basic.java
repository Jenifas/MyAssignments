package week1.day4;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class Selenium1basic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver1=new ChromeDriver();
		driver1.get("http://leaftaps.com/opentaps/control/main");
		
		
		//EdgeDriver driver2=new EdgeDriver();
		//driver2.get("http://leaftaps.com/opentaps/control/main");
		
		driver1.manage().window().maximize();
		//driver2.manage().window().minimize();
		
		String title1 = driver1.getTitle();
		System.out.println(title1+"-Chrome");
		
		//String title2 = driver1.getTitle();
		//System.out.println(title2+"-edge");
		
		
		
		driver1.quit();//closes all open tabs
		//driver2.close();//closes the current tab

	}

}
