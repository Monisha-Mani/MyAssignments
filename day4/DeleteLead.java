package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class DeleteLead {
public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Leads")).click();
	driver.findElement(By.linkText("Find Leads")).click();
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("123456789");
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	Thread.sleep(5000);
	WebElement firstLead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]"));
	String leadID = firstLead.getText();
	System.out.println(leadID+" is the selected Lead ID for Deletion");
	firstLead.click();
	driver.findElement(By.xpath("//a[text()='Delete']")).click();
	driver.findElement(By.xpath("//a[text()='Find Leads']")).click();
	driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadID);
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	WebElement delete=driver.findElement(By.xpath("//div[text()='No records to display']"));
	String deleted = delete.getText();
	if(deleted.equals("No records to display"))
	{
		System.out.println("Lead "+leadID+" is deleted");
	}
	else 
	{
		System.out.println(leadID+" is not deleted");
	}
	driver.close();
	
	
}
}
