package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateContact {
public static void main(String[] args) {
	ChromeDriver driver=new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
	driver.findElement(By.id("password")).sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.linkText("CRM/SFA")).click();
	driver.findElement(By.linkText("Contacts")).click();
	driver.findElement(By.linkText("Create Contact")).click();
	driver.findElement(By.xpath("//input[@id='firstNameField']")).sendKeys("Monisha");
	driver.findElement(By.xpath("//input[@id='lastNameField']")).sendKeys("M");
	driver.findElement(By.xpath("//input[@id='createContactForm_firstNameLocal']")).sendKeys("Monisha");
	driver.findElement(By.xpath("//input[@id='createContactForm_lastNameLocal']")).sendKeys("M");
	driver.findElement(By.xpath("//input[@id='createContactForm_departmentName']")).sendKeys("Testing");
	driver.findElement(By.xpath("//textarea[@id='createContactForm_description']")).sendKeys("Testing Description");
	driver.findElement(By.xpath("//input[@id='createContactForm_primaryEmail']")).sendKeys("monishamkt@gmail.com");
	WebElement stateProvision = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
	Select dropdown = new Select(stateProvision);
	dropdown.selectByVisibleText("New York");
	driver.findElement(By.xpath("//input[@id='createContactForm_primaryPhoneNumber']")).sendKeys("123456789");
	driver.findElement(By.className("smallSubmit")).click();
	driver.findElement(By.linkText("Edit")).click();
	driver.findElement(By.id("updateContactForm_description")).clear();
	driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("Important Notes");
	driver.findElement(By.xpath("//input[@value='Update']")).click();
	String pageFinalTitle = driver.getTitle();
	System.out.println(pageFinalTitle);
	
}
}
