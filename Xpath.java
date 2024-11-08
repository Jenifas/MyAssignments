package week2.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class Xpath {



			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				ChromeDriver driver1=new ChromeDriver();
				driver1.get("http://leaftaps.com/opentaps/control/main");
				driver1.manage().window().maximize();
				
				driver1.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
				driver1.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");
				
			}
}