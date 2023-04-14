package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {
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
		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("monishamkt@gmail.com");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement firstLeadName = driver.findElement(By.xpath("(//table[@class='x-grid3-row-table']//a)[3]"));
		String leadName = firstLeadName.getText();
		System.out.println(leadName+" is the selected Lead Name for Duplictaion");
		driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]")).click();
		driver.findElement(By.xpath("//a[text()='Duplicate Lead']")).click();
		driver.findElement(By.className("smallSubmit")).click();
		WebElement duplicateLeadName = driver.findElement(By.id("viewLead_firstName_sp"));
		String duplicateName = duplicateLeadName.getText();
		
		if(leadName.equals(duplicateName))
		{
			System.out.println("Duplicated lead name is same as Original Lead Name " + duplicateName);
		}
		else
			System.out.println("Duplicate and Original Lead Name are Different");
		driver.close();
	}
}
