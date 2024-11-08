package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebookdetails {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver facedriver= new ChromeDriver();
		facedriver.get("https://en-gb.facebook.com/");
		facedriver.manage().window().maximize();
		String title = facedriver.getTitle();
		System.out.println(title);
		
		
		//create new account 2 ways
		// facedriver.findElement(By.partialLinkText("Create new account")).click();
		// or xpath text based 
		facedriver.findElement(By.xpath("//a[text()='Create new account']")).click();
		facedriver.findElement(By.name("firstname")).sendKeys("Jenifa");
		facedriver.findElement(By.name("lastname")).sendKeys("Priya");
		//xpath for radio button
		facedriver.findElement(By.xpath("//label[text()='Female']")).click();
		WebElement DD1 = facedriver.findElement(By.id("day"));
		Select obj1= new Select (DD1);
		obj1.selectByValue("16");
		
		WebElement DD2 = facedriver.findElement(By.id("month"));
		Select obj2= new Select (DD2);
		obj2.selectByVisibleText("Mar");
		
		WebElement DD3 = facedriver.findElement(By.id("year"));
		Select obj3= new Select (DD3);
		obj3.selectByIndex(15);
		//xpath using attribute
		facedriver.findElement(By.xpath("(//input[@type='text'])[5]")).sendKeys("jerrytom88@gmail.com");
		//xpath using elder to younger sibling new password
		facedriver.findElement(By.xpath("(//div[contains (text(),'New password')]/ following-sibling :: input)")).sendKeys("Test@123");
		facedriver.findElement(By.xpath("//button[@type='submit']")).click();
		//facedriver.findElement(By.xpath(title))
		
		
	}
}