package week2.day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
public class AccountDD {



			public static void main(String[] args) {
				// TODO Auto-generated method stub
				
				ChromeDriver driver1=new ChromeDriver();
				driver1.get("http://leaftaps.com/opentaps/control/main");
				driver1.manage().window().maximize();
				
				
				String title1 = driver1.getTitle();
				System.out.println(title1);
				//by id as no alphanumeric
				driver1.findElement(By.id("username")).sendKeys("demosalesmanager");
			
				driver1.findElement(By.name("PASSWORD")).sendKeys("crmsfa");//by name
				driver1.findElement(By.className("decorativeSubmit")).click();//by classname
				//<ahref partial text as white spaces are present
				driver1.findElement(By.partialLinkText("CRM/SFA")).click();
				driver1.findElement(By.linkText("Accounts")).click();
				driver1.findElement(By.partialLinkText("Create Account")).click();
				driver1.findElement(By.id("accountName")).sendKeys("Tester500");
				driver1.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
				driver1.findElement(By.id("numberEmployees")).sendKeys("56");
				driver1.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
				//Dropdowns in account page
				WebElement element1 = driver1.findElement(By.name("ownershipEnumId"));
				Select DD1 = new Select(element1);
				DD1.selectByVisibleText("S-Corporation");
				
				WebElement element2 = driver1.findElement(By.id("dataSourceId"));
				Select DD2 = new Select(element2);
				DD2.selectByValue("LEAD_EMPLOYEE");
				
				WebElement element3 = driver1.findElement(By.id("marketingCampaignId"));
				Select DD3 = new Select(element3);
				DD3.selectByIndex(6);
				
				WebElement element4 = driver1.findElement(By.id("generalStateProvinceGeoId"));
				Select DD4 = new Select(element4);
				DD4.selectByValue("TX");
				
				driver1.findElement(By.className("smallSubmit")).click();
				
				
				
				//how to verify the account name in details
				//inside span
				
				String title2 = driver1.getTitle();
				System.out.println(title2);
				if (title2.contains("Create Account | opentaps CRM")) {
					System.out.println("An account with this name already exists");
					driver1.findElement(By.partialLinkText("Create Account Ignoring Duplicates")).click();
					//yes or no button??
					Alert alertyes = driver1.switchTo().alert();
					alertyes.accept();
					WebElement ele1 = driver1.findElement(By.xpath("//span[contains(text(),'Tester')]"));
					String text1 = ele1.getText();
					System.out.println(text1);
					if(text1.contains("Tester"))
					{
					System.out.println("Account name displayed as expected");
					}
					else
					{
					System.out.println("Account name not displayed");
					}
					driver1.close();
			//Duplicate account creation		
				} else 
				if (title2.contains("Account Details | opentaps CRM")){
System.out.println("Title verified and account created successfully"  );
//account name validation 
WebElement ele1 = driver1.findElement(By.xpath("//span[contains(text(),'Tester')]"));
//get text gets text from the address webelement returns
String text1 = ele1.getText();
System.out.println(text1);
if(text1.contains("Tester"))
{
System.out.println("Account name displayed as expected");
}
else
{
System.out.println("Account name not displayed");
}
driver1.close();

				}
			}
}
				
				
				
				
				
		