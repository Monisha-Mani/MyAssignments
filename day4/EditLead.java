package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		String updateCompany="GreenElephant";
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Monisha");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(5000);
		WebElement firstLead = driver.findElement(By.xpath("//table[@class='x-grid3-row-table']//a[1]"));
		String leadID = firstLead.getText();
		System.out.println(leadID+" is the selected Lead ID for Edit");
		firstLead.click();
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//a[text()='Edit']")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(updateCompany);
		driver.findElement(By.className("smallSubmit")).click();
		WebElement updateCompanyName = driver.findElement(By.id("viewLead_companyName_sp"));
		String companyName = updateCompanyName.getText();
		System.out.println(companyName);
		if(companyName.contains(updateCompany))
		{
			System.out.println("Company Name is updated correctly");
		}
		else
			System.out.println("Company name is not updated");
		
		driver.close();
	
	}
}
